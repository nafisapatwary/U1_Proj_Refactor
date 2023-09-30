public class TipCalculator {
    // Instance variables
    public double bill;
    public double tipPercentage;
    public int numPeople;

    // Constructor
    public TipCalculator(double bill, double tipPercentage, int numPeople) {
        this.bill = bill;
        this.tipPercentage = tipPercentage;
        this.numPeople = numPeople;
    }

    //calculate and return the tip amount
    public double calculateTip() {
        return (bill * tipPercentage) / 100.0;
    }

    //calculate and return the total bill (bill + tip)
    public double calculateTotalBill() {
        return bill + calculateTip();
    }

    //calculate and return the tip per person
    public double calculateTipPerPerson() {
        return calculateTip() / numPeople;
    }

    //calculate and return the total per person
    public double calculateTotalPerPerson() {
        return calculateTotalBill() / numPeople;
    }

    // Method to print out tip details
    public void printTipDetails() {
        System.out.printf("Your total tip is $%.2f %n", calculateTip());
        System.out.printf("Your total bill is $%.2f %n", calculateTotalBill());
        System.out.printf("Tip Per Person: $%.2f %n", calculateTipPerPerson());
        System.out.printf("Total Per Person: $%.2f %n", + calculateTotalPerPerson());
    }
}