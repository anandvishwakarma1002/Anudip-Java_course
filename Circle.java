import java.util.Scanner;
public class Circle
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter The Radius: ");
        /*We are storing the entered radius in double
         * because a user can enter radius in decimals
         */
        double Radius = sc.nextDouble();

        //Area = PI*Radius*Radius
        double Area = Math.PI * (Radius * Radius);
        System.out.println("The Area Of Circle Is: " + Area);

        //Circumference = 2*PI*Radius
        double Circumference= Math.PI * 2*Radius;
        System.out.println( "The Circumference Of Circle Is: "+Circumference) ;
    }
}
