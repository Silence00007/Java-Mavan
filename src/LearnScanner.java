import java.util.Scanner;

public class LearnScanner {

    public static void main (String [] args)
    {
        // Create Scanner object
        Scanner scanner= new Scanner(System.in);
        // nextLine() - reads an entire line
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // next() - reads the next token (up to space)
        System.out.print("Enter your favorite word: ");
        String word = scanner.next();

        // nextInt() - reads an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // nextDouble() - reads a double (e.g. decimal number)
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();

        // nextBoolean() - reads a boolean (true/false)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // nextFloat() - reads a float (e.g. decimal number)
        System.out.print("Enter your weight in kg (e.g., 70.5): ");
        float weight = scanner.nextFloat();

        // nextLong() - reads a long number (e.g. large integer)
        System.out.print("Enter your phone number: ");
        long phone = scanner.nextLong();

        // Output all the data
        System.out.println("\n--- User Info ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Favorite Word: " + word);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Is Student: " + isStudent);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Phone Number: " + phone);

        scanner.close();


    }
}
