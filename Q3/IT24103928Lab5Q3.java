import java.util.Scanner;

public class IT24103928Lab5Q3 {
    
    private static final double ROOM_CHARGE_PER_DAY = 48000.00;
    private static final int MIN_DAYS_FOR_DISCOUNT = 3;
    private static final double DISCOUNT_RATE_10 = 10.0;
    private static final double DISCOUNT_RATE_20 = 20.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the start date of reservation (1-31):");
        int startDate = scanner.nextInt();

        System.out.println("Enter the end date of reservation (1-31):");
        int endDate = scanner.nextInt();

       
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start and end dates must be between 1 and 31.");
            return; // Exit the program
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return; // Exit the program
        }

      
        int numberOfDays = endDate - startDate;

        
        double discountRate = 0.0;
        if (numberOfDays >= MIN_DAYS_FOR_DISCOUNT) {
            if (numberOfDays <= 4) {
                discountRate = DISCOUNT_RATE_10;
            } else {
                discountRate = DISCOUNT_RATE_20;
            }
        }


        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        double discount = totalAmount * (discountRate / 100);
        double finalAmount = totalAmount - discount;

       
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.printf("Total amount (before discount): Rs %.2f%n", totalAmount);
        System.out.printf("Discount applied: %.2f%%%n", discountRate);
        System.out.printf("Final amount to be paid: Rs %.2f%n", finalAmount);

        scanner.close();
    }
}
