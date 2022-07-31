import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/routes.csv";

        Scanner sc = new Scanner(System.in);
        Booking obj2 = new Booking();

        //calling method
        obj2.readFromFile(fileName);

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------Airline Ticket Reservation System-----------------------------");
        System.out.println("Available flights ");
        System.out.println();
        // calling display method
        obj2.display();
        System.out.println("Would you like to book flight tickets (y/n)");
        String input1 = sc.next();
        if (input1.equalsIgnoreCase("y")) {
            int n = 0;
            do {
                System.out.println("Enter the source location");
                String input2 = sc.next();
                System.out.println("Enter the destination location");
                String input3 = sc.next();
                // calling findFlights method
                int[] arr = obj2.findFlights(input2, input3);
                if (arr[0] == 0 && arr[1] == 0) {
                    n = 0;
                } else n = 1;
            }
            while (n == 0);
            System.out.println();
            System.out.println("Select Flight");
            int input4 = sc.nextInt();
            obj2.selectedFlight(input4);
            int choice = 0;
            do {
                choice = obj2.passengerDetails();
            }
            while (choice != 1);
            System.out.println("Details Confirmed");
            String pnr = obj2.generatePNR();
            obj2.displayTicket();
            // booked
            String pnr1;
            String pnr2;
            String input5;
            String input8;
            int input6;

            System.out.println("Ticket has been successfully booked, see flight details with the help of PNR");
            System.out.println("would you like to see flight details through PNR (y/n) ");
            input5 = sc.next();
            if (input5.equalsIgnoreCase("y")) {
                System.out.println("Enter your 7 number alphanumeric PNR ");
                int res;
                do
                {
                    pnr1 = sc.next();
                    res = obj2.operationPNR(pnr1);
                }
                while (res != 0);
            } else if (input1.equalsIgnoreCase("n")) {
                System.out.println("Thank you, have a great day ahead");
            } else {
                System.out.println("Invalid input, please try again");
            }

            System.out.println("To cancel ticket, press1 or press 0 to exit");
            input6 = sc.nextInt();
            if (input6 == 1) {
                do {
                    System.out.println("Enter your 7 number alphanumeric PNR ");
                    pnr2 = sc.next();
                    obj2.deleteTicket(pnr2);

                    System.out.println("Would you like to check flight details again (y/n) ");
                    input8 = sc.next();

                    if (input8.equalsIgnoreCase("n")) {
                        System.out.println("Thank you, have a great day ahead");
                    }

                }
                while (input8.equalsIgnoreCase("y"));
            } else if (input6 == 0) {
                System.out.println("Thank you, have a great day ahead");
            } else {
                System.out.println("Invalid input, please try again");
            }
        }
        else if (input1.equalsIgnoreCase("n")) {
            System.out.println("Thank you, have a great day ahead");
        } else {
            System.out.println("Invalid input, please try again");
        }
    }
}