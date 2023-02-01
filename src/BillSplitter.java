import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the total bill amount?");
        double TotalAmount = scanner.nextDouble();

        System.out.println("Total number of people?");
        int NumPersons = scanner.nextInt();

        double splitBill = TotalAmount / NumPersons;

        System.out.format(" The total amount, split between " + NumPersons + " people, comes to $%.2f each person.", splitBill);
    }
}
