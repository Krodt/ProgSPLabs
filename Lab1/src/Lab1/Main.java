package Lab1;

import java.io.*;
import java.util.Scanner;

public class Main {
    private Loader loader1;
    private Loader loader2;
    private Loader loader3;

    public static void main (String[]args){
        new Main().start();
    }

    Main() {
            System.out.println("Put down the information about the loaders");
            loader1 = new Loader();
            loader2 = new Loader();
            loader3 = new Loader();
            CapacityCount.enterCapacity();
        }

        public void start() {
            long timer = System.currentTimeMillis();
            Thread thread1 = new Thread(loader1);
            Thread thread2 = new Thread(loader2);
            Thread thread3 = new Thread(loader3);
            thread1.start();
            thread2.start();
            thread3.start();
            while (thread1.isAlive()&&thread2.isAlive()&&thread3.isAlive()) {
            }
            long time = (System.currentTimeMillis()-timer)/1000;
            System.out.println("The resulting time:"+time/60+" hours "+ time%60+" minutes");
        }
    }


