import java.util.Scanner;

public class GuestListProgram {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        guests[0] = "Poli";
        guests[1] = "John";
        guests[2] = "Bob";
        guests[3] = "Dill";
        guests[4] = "Jon";

        do {
            displayGuests();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.println("Name:");
                        String name = scanner.next();
                        guests[i] = name;
                        break;
                    }
                }
            } else if (option == 2) {
                System.out.println("Name:");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
            } else if (option == 3) {
                System.out.println("Exiting....");
                break;
            }
        } while (true);
    }
    static void displayGuests () {
        System.out.println("_________________________\n- Guests -\n");
        for (int i = 0; i < guests.length; i++) {
            System.out.println((i + 1)  + ". " + (guests[i] == null ? "--" : guests[i]));
        }
    }
    static void displayMenu () {
            System.out.println("\n");
            System.out.println("_________________________\n- Menu -\n");
            System.out.println("1 - Add guests");
            System.out.println("2 - Remove guests");
            System.out.println("3 - Exit");
    }
    static int getOption () {
        System.out.println("Option: ");
        int option = scanner.nextInt();
        System.out.println();
        return option;
    }
}

