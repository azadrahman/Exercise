
package excercise;

import java.util.Scanner;
public class Excercise {
public static void main(String ar[])
{
    int a;
    float b;
    Scanner obj= new Scanner(System.in);
    System.out.println("Enter an integer number ");
    a=obj.nextInt();
    System.out.println("Enter a float number: ");
    b= obj.nextFloat();
    System.out.println("Enter your name ");
    String name= obj.nextLine();
    System.out.println("Square is "+(a*a));
    System.out.println("Qube is "+(b*b*b));
    System.out.println("Your name is "+name);
    
} 
}
