
/**
 * Runner Class for Car
 * 
 * Gillian
 * Oct 26, 2015
 */

import java.util.Scanner;
public class CarRunner
{
   public static void main (String[] args)
   {
       String a, a2, b, b2;
       int c, c2;
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the make of the car:");
       a = scan.nextLine();
       
       System.out.println("Enter the model of the car:");
       b = scan.nextLine();
       
       System.out.println("Enter the year of the car:");
       c = scan.nextInt();
       
       Car car1 = new Car(a, b, c);
       
       Scanner scan2 = new Scanner(System.in);
       System.out.println("Enter the make of the car:");
       a2 = scan2.nextLine();
       
       System.out.println("Enter the model of the car:");
       b2 = scan2.nextLine();
       
       System.out.println("Enter the year of the car:");
       c2 = scan2.nextInt();
       
       Car car2 = new Car(a2, b2, c2);
       
       System.out.println(car1.getMake() + " " + car1.getModel() + " " + car1.getYear());
       System.out.println(car1.isAntique(c));
       System.out.println(car2);
       System.out.println(car2.isAntique(c));
   }
}
