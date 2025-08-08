import java.util.Scanner;

public class Scanner_usage {

    public static void main (String [] args )
    {
        System.out.println("Welcome to the Scanner world now you can feed input and check the result");

    Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your age  enter only number eg: 123");
        int Age = scanner.nextInt();
        if (Age>=48) {
            System.out.println("Hello sir Welcome to the senior citizen world");
        }
        else if (Age>=30) {
            System.out.println("oye bale bale mere cheetha to tu :Adult: age ka launda hai");
        } else if (Age>=15) {
            System.out.println("oye mere sher tum to :young: ho gya");
        } else if (Age>=5) {
            System.out.println("hello baby welcome to the child group");
        }
        else {
            System.out.println("hey welcome to infante age group");
        }

    }

}
