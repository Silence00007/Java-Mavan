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
        }*/


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

    }
}
