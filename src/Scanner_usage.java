import java.util.Scanner;

public class Scanner_usage {

    public static void main (String [] args )
    {
        System.out.println("Welcome to the Scanner world now you can feed input and check the result");

    Scanner scanner =new Scanner(System.in);
        /*System.out.println("Enter your age  enter only number eg: 123");
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
        }*/

        System.out.println("Enter the week Number between the number 1 to 7 ");
        //String name = scanner.nextLine();
        int Week_num= scanner.nextInt();
        if (Week_num == 1)
        {
            System.out.println("The name of the week is  : MONDAY ");
        } else if (Week_num==2) {
            System.out.println("The name of the week is  : TUSEDAY ");
        } else if (Week_num==3) {
            System.out.println("The name of the week is  : WEDNESHDAY");
        } else if (Week_num==4) {
            System.out.println("The name of the week is  : THURSDAY");
        } else if (Week_num==5) {
            System.out.println("The name of the week is  : FRIDAY");
        } else if (Week_num==6) {
            System.out.println("The name of the week is : SATURDAY");
        } else if (Week_num==7) {
            System.out.println("The name of the week is  : SUNDAY");
        } else {
            System.out.println("INVALID WEEK NAME");
        }

    }

}
