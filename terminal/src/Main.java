import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /* to get data from the terminal
        String name = args[0];
        String lastName = args[1];
        int age = Integer.parseInt(args[2]);
        double height = Double.parseDouble(args[3]);
        */
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Type your name");
        String name = sc.next();

        System.out.println("Type your last name");
        String lastName = sc.next();

        System.out.println("Type your age");
        int age = sc.nextInt();

        System.out.println("Type your height");
        double height = sc.nextDouble();

        System.out.println("Hi my name is " + name + " " + lastName);
        System.out.println("I am " + age + " years old");
        System.out.println("I am " + height + "cm");
    }
}