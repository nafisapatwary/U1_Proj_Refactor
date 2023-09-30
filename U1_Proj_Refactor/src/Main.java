import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a TipCalculator object with user input
        Scanner s = new Scanner(System.in);
        System.out.println("Hello! I hope you enjoyed your meal.");

        // initialize variables using user inputs
        // initialize bill variable
        System.out.println("Please enter your bill: ");
        String b = s.nextLine();
        double bill = Double.parseDouble(b);

        //initialize tipPercentage variable
        System.out.println("Please enter the tip percentage: ");
        String p = s.nextLine();
        double tipPercentage = Double.parseDouble(p);

        //initialize numPeople variable
        System.out.println("Please enter the amount of people in your party: ");
        String n = s.nextLine();
        int numPeople = Integer.parseInt(n);

        TipCalculator c = new TipCalculator(bill, tipPercentage, numPeople);
        double tip = c.calculateTip();
        double totalBill = c.calculateTotalBill();
        double tipPerPerson = c.calculateTipPerPerson();
        double totalPerPerson = c.calculateTotalPerPerson();

        c.printTipDetails();
    }
}
