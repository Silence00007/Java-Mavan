import java.util.Scanner;

public class Java_conditiontions {
    public  static void main (String [] args)
    {
       /* // Java conditions IF and ELSE

        int a = 6;
        if (a>=10)
        {
            System.out.println("we are happy that condition is correct so if blocks run ");
        }
        else {
            System.out.println("condition is false so else blocks runs");
        }


        // Else IF ,categorise the child, young, adult and senior citizen
        int b=49;
        if (b>=48)
        {
            System.out.println("The person is belongs to the senior citizen Age Group");
        } else if (b>=28) {
            System.out.println("The person is belongs to the Adult  Age Group");
        } else if (b>=15) {
            System.out.println("The person is belongs to the Young  Age Group");
        }

        else{
            System.out.println("The Person is belong to the child Age Group");
        }

        // using Else if print the week name

        int week=5;
        if (week==1){
            System.out.println("The Name of the Week is MONDAY");
        } else if (week==2) {
            System.out.println("The Name of the Week is TUSEDAY");
        } else if (week==3) {
            System.out.println("The Name of the Week is WEDNESDAY");
        } else if (week==4) {
            System.out.println("The Name of the Week is THURSDAY");
        } else if (week==5) {
            System.out.println("The Name of the Week is FRIDAY");
        } else if (week==6) {
            System.out.println("The Name of the Week is SATURDAY");
        } else if (week==7) {
            System.out.println("The Name of the Week is SUNDAY");
        } else {
            System.out.println("INVALID WEEK Please enter the number between 1 to 7");
        }

        //Switch Case by using it print week name with Scanner

        Scanner scanner = new Scanner(System.in);  // Create Scanner object
        System.out.print("Enter the week number (1 to 7): ");
        int weekday=scanner.nextInt();             // Read an integer
        switch (weekday)
        {
            case 1:
                System.out.println("MONDAY"); break;
            case 2:
                System.out.println("TUESDAY"); break;
            case 3:
                System.out.println("WEDNESDAY"); break;
            case 4:
                System.out.println("THURSDAY"); break;
            case 5:
                System.out.println("FRIDAY"); break;
            case 6:
                System.out.println("SATURDAY"); break;
            case 7:
                System.out.println("SUNDAY"); break;
            default:
                System.out.println("Please enter the valid week number Between 1 to 7");

        }
        scanner.close(); */              // Always close Scanner

        //Using Scanner

        Scanner scanner= new Scanner(System.in);  // Create Scanner object
        System.out.println("Enter your Age: ");
        String age1=scanner.nextLine();
        //int age = scanner.nextInt();               // Read an integer
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read a line of text
        System.out.println("Enter your Highest qualification: ");
        String edu = scanner.nextLine();


        System.out.println("Hello, " + name + "! You are " + age1 + " years old,and you have complete your  " + edu );

        scanner.close();                           // Always close Scanner


    }
}
