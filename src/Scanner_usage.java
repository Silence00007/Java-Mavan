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
        }
        // Print week name by using if else and scanner

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

        //print month name by using switch case and scanner

        System.out.println(" Hello !! please enter the number between 1 to 12 !!!!!!....");
        int month = scanner.nextInt();
        switch (month)
        {
            case 1 :System.out.println("Dear the number of month you feed is JANUARY "); break;
            case 2 :
                System.out.println("Dear the number of month you feed is  FEBRUARY"); break;
            case 3:
                System.out.println("Dear the number of month you feed is MARCH "); break;
            case 4 :
                System.out.println("Dear the number of month you feed is APRIL "); break;
            case 5 :
                System.out.println("Dear the number of month you feed is MAY"); break;
            case 6 :
                System.out.println("Dear the number of month you feed is JUNE"); break;
            case 7:
                System.out.println("Dear the number of month you feed is JULY"); break;
            case 8 :
                System.out.println("Dear the number of month you feed is AUGUST"); break;
            case 9 :
                System.out.println("Dear the number of month you feed is SEPTEMBER"); break;
            case 10 :
                System.out.println("Dear the number of month you feed is OCTOBER"); break;
            case 11 :
                System.out.println("Dear the number of month you feed is NOVEMBER "); break;
            case 12 :
                System.out.println("Dear the number of month you feed is 'DECEMBER' "); break;

            default:
                System.out.println("This as an Invalid month please enter the number between 1 to 12");

        }

        // Print the name and his details by using some name to enter by using scaner and using if and else conditionals
        System.out.println("Enter only A B C and D");

        String name= scanner.nextLine().toUpperCase();
        if (name.equals("A"))
        {
            System.out.println("Hii, i am the elder person of the family , i am APLHA " );
        } else if (name.equals("B")) {
            System.out.println("Hii, i am the 2nd elder person of the family , i am BETA ");
        } else if (name.equals("C")) {
            System.out.println("Hii, i am the 3rd elder person of the family , i am GAMMA ");
        } else if (name.equals("D")) {
            System.out.println("Hii, i am the 4th elder person of the family , i am zeta ");
        } else if (name.equals("SUDHANSHU")) {
            System.out.println("hello dear 'SUDHANSHU' welcome to the family group ");
        }*/


        // Print the name and his details by using some name to enter by using scanner and using Switch case conditionals
        System.out.println("Enter only A B C and D");

        String name= scanner.nextLine().toUpperCase();
        switch (name) {
            case "A" :
                System.out.println("Hello my name is : Champion"); break;
            case "B" :
                System.out.println("Hi i am : kitty , how are you dear "); break;
        }


    }

}
