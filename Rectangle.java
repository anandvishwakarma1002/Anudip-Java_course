import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of Rectangle: ");
        double Length = sc.nextDouble();

        System.out.print("Enter the width of Rectangle: ");
        double Width = sc.nextDouble();

        //Area = length*width;
        double Area = Length*Width;
        System.out.println("Area of Rectangle is: "+ Area);

        //Perimeter = 2*(length+width);
        double Perimeter = 2*(Length+Width);
        System.out.println("Perimeter of Rectangle is: "+ Perimeter);
    }
}