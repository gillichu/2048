/**
 * Write a class called Dog and Kennel that contains instance data that represents the dog's name and age. 
 * Define the Dog constructor to accept and intialize instance data. Include getter and setter methods for the name and age.
 * Include getter and setter methods for the name and age. Include a method to compute and return the age of the dog in
 * person years (7 times the dog's age.) Include a toString method that returns a one-line description of the dog.
 * Createa  driver class called Kennel, whose main method instantiates and updates several Dog objects.
 * 
 * Gillian
 * Oct 26th, 2015
 */
import java.util.Scanner;
public class Kennel
{
   public static void main(String[] args)
   {
       String n, n2;
       int a, a2;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the name of the dog:");
       n = scan.nextLine();
       
       System.out.println("Enter the age of the dog:");
       a = scan.nextInt();
       
       DogandKennel Sparky = new DogandKennel(a,n);
       System.out.println("Enter the name of the dog:");
       n2 = scan.nextLine();
       scan.nextLine();
       System.out.println("Enter the age of the dog:");
       a2 = scan.nextInt();
       
       DogandKennel Pinky = new DogandKennel(a2, n2);
       
       Sparky.HumanYear();
       Pinky.HumanYear();
       
       System.out.println(Sparky.getName() + " " + Sparky.getAge());
       Pinky.setName("Rex");
       System.out.println(Pinky);
   }
}
