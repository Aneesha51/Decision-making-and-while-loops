import java.time.Year;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int age = -1;

        int currentYear = Year.now().getValue();

        while (true) {
            System.out.println("Please enter your age : ");

            if (sc.hasNextInt()) {
                age = sc.nextInt();
                System.out.println("============================= Results ====================================");


                if (age < 0) {
                    System.out.println("Age cannot be negative. Please try again");
                } else if (age > 120) {
                    System.out.println("Age seems unrealistic. Please enter a realistic age.");
                } else {
                    int birthYear = currentYear - age;
                    System.out.println("Thank you your age is recorded as : " + age + ".");
                    System.out.println("You were born in " + birthYear);
                    break;
                }
        }

        else{
            System.out.println("Invalid input, please enter a valid input");
            sc.next();
        }
       }

       sc.close();
    }
}
