import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args) {
        float P, T, R, SI;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Principal: ");
        P = sc.nextFloat();

        System.out.print("Enter The Time Period: ");
        T = sc.nextFloat();
        
        System.out.print("Enter The Rate Of Interest: ");
        R = sc.nextFloat();

        SI = (P * T * R)/100;
        System.out.print("The Simple Interest is: " + SI);
    }
}