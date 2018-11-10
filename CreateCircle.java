
package excercise;
import java.util.Scanner;
public class CreateCircle {
    public static void main(String ar[])
    {
        float a;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a radius ");
        a= obj.nextFloat();
        System.out.println("Ares of circle is "+(2*3.14*a));
    }
}
