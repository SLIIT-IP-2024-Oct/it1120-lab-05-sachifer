import java.util.Scanner;

public class IT24103928Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of new members introduced (>= 0):");
        
        
        int newMembers = -1;
        while (newMembers < 0) {
            if (scanner.hasNextInt()) {
                newMembers = scanner.nextInt();
                if (newMembers < 0) {
                    System.out.println("Invalid input! Please enter a number greater than or equal to 0:");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number:");
                scanner.next();
            }
        }
        
        
        String prize;
        switch (newMembers) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                prize = "Headphone";
        }

        
        System.out.println("You are entitled to: " + prize);
        
        scanner.close();
    }
}
