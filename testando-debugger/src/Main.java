import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Type your account number!");
        int account = sc.nextInt();
        System.out.println("Type your agency number!");
        String agency = sc.next();
        System.out.println("Type your first name!");
        String firstName = sc.next();
        System.out.println("Type your last name!");
        String lastName = sc.next();
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Type your account's balance!");
        double balance = sc.nextDouble();

        System.out.println("Hi "+ fullName + ", thanks for creation an account in our bank your agency's number is " +
                agency + ", your account's number is " + account + " and your balance " + balance +
                " is already available for withdrawal" );
    }
}