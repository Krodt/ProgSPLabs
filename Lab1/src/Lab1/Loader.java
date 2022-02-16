package Lab1;


import java.util.Scanner;

public class Loader implements Runnable {
    public int number;
    public int capacity;
    public int loadTime;
    public int waitTime;
    public int sumCapacity;
    Scanner scanner = new Scanner(System.in);

    Loader(){
        System.out.println("Number: ");
        number=scanner.nextInt();
        System.out.print("Capacity: ");
        capacity=scanner.nextInt();
        System.out.print("Load time: ");
        loadTime=scanner.nextInt();
        System.out.print("Wait time: ");
        waitTime=scanner.nextInt();

    }

    @Override
    public void run(){
        int add;
        while((add=CapacityCount.minusCapacity(capacity))>0){
            sumCapacity+=add;
            try{
                Thread.sleep(waitTime*1000);
                Thread.sleep(loadTime*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("The capacity loader №"+number+" loaded is: "+sumCapacity);
        }
}

