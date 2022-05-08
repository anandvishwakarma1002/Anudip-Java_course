import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        // Mini Calculator

        int A, B, input, Exit;

        do {

            System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Modulus \n");

            Scanner cal = new Scanner(System.in);
            System.out.print("Choose Task: ");
            input = cal.nextInt();

            if (input != 6) {
                System.out.print("Enter 1st Number: ");
                A = cal.nextInt();

                System.out.print("Enter 2nd Number: ");
                B = cal.nextInt();
            } else {
                System.out.println("Invalid Input");
                break;
            }

            switch (input) {
                case 1 -> {
                    int C = A + B;
                    System.out.println("Addition is: " + C);
                    System.out.println();
                }
                case 2 -> {
                    int D = A - B;
                    System.out.println("Subtraction is: " + D);
                    System.out.println();
                }
                case 3 -> {
                    int E = A * B;
                    System.out.println("Multiplication is: " + E);
                    System.out.println();
                }
                case 4 -> {
                    int F = A / B;
                    System.out.println("Division is: " + F);
                    System.out.println();
                }
                case 5 -> {
                    int G = A %= B;
                    System.out.println("Modulus is: " + G);
                    System.out.println();
                }
                default -> System.out.println("ERROR");
            }

                    System.out.println("Do You Want To Continue The Program? 1.YES 2.NO ");
                    System.out.print("Press The Key: ");
                    Exit = cal.nextInt();

        }
        while (Exit == 1);
    }
}
