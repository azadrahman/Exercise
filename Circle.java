
package excercise;

public class Circle {
   
    float a, res; 
            
    Circle(int x)
    {
        a=x;
        System.out.println("A circle ");
        
    }
    void Area()
    {
        res= 2*a;
        System.out.println("Area is "+ res);
    }
}
