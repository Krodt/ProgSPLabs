package Lab1;


import java.util.Scanner;

public class CapacityCount {
    public static int totalCapacity;
    public static int enterCapacity(){
        System.out.println("Total capacity:");
        Scanner scanner = new Scanner(System.in);
        totalCapacity=scanner.nextInt();
        return totalCapacity;
    };

    public static synchronized int minusCapacity(int amountTaken){
        int amountLeft;
        if(totalCapacity-amountTaken>0){
           amountLeft=amountTaken;
           totalCapacity=totalCapacity-amountTaken;

        }else {amountLeft=totalCapacity;
              totalCapacity=totalCapacity-amountTaken;
        }
        return amountLeft;
    }
}
