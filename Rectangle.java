import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of Rectangle: ");
        double Length = sc.nextDouble();

        System.out.print("Enter the Width of Rectangle: ");
        double Width = sc.nextDouble();

        //Area = Length*Width;
        double Area = Length*Width;
        System.out.println("Area of Rectangle is: "+ Area);

        //Perimeter = 2*(Length+Width);
        double Perimeter = 2*(Length+Width);
        System.out.println("Perimeter of Rectangle is: "+ Perimeter);
    }
}
