import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
	// CODE FOR ATM_MACHINE
        // CB:- CHECK BALANCE
        // WD:- WITHDRAWAL
        // DP:- DEPOSIT

        double CB = 0;
        double WD, DP;

        System.out.println("\tWelcome To The ATM");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Account No: ");
        String Ac = sc.nextLine();
        if (Ac.length() != 10) {
            System.out.println("Invalid Account No");
            return;
        }
        System.out.println("----------------------");

        System.out.print("Enter Your PIN No: ");
        String Pin = sc.nextLine();
        if (Pin.length() != 4) {
            System.out.println("Invalid Pin No");
            return;
        }
        System.out.println("----------------------");

        while(true){
            System.out.println("1.Deposit " + "2.Withdrawal " + "3.Check_Balance " + "4.Exit");
            System.out.println();
            System.out.print("Select the Key: ");

            int select = sc.nextInt();

            switch (select) {
                // For Deposit Amount
                case 1 -> {
                    System.out.print("Enter The Amount for Deposit: ");
                    DP = sc.nextDouble();
                    CB = CB + DP;
                    System.out.println("Your Amount " + DP + " is Successfully Deposited");
                    System.out.println();
                }
                // For Withdrawal Amount
                case 2 -> {
                    System.out.print("Enter The Amount for Withdrawal: ");
                    WD = sc.nextDouble();
                    if (WD <= CB) {
                        CB = CB - WD;
                        System.out.println("Your Amount " + WD + " is Withdrawal");
                        System.out.println("Please Collect Your Money");
                        System.out.println();
                    } else {
                        System.out.println("You Don't Have Sufficient Amount");
                    }
                    System.out.println();
                }
                // For Check_Balance
                case 3 -> {
                    System.out.println("Your Current Balance is " + CB);
                    System.out.println();
                }
                // For Exit
                case 4 -> System.exit(2);
                default -> System.out.println("Invalid Key");
            }
        }
    }
}