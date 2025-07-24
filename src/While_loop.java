public class While_loop {
    public static void main(String[] args) {

        // While loop
        int x= 100;
                while(x<=100){

                    System.out.println("Welcome to the while loop ");
                    x++;
                }


      // do while
       int y= 10;
                do{
                    System.out.println("hello this is the do while loop welcome");
                    y++;
                } while (y<=1);



    // For Loop
    //Print from 1 to 10
        System.out.println("Print between 0 to 10 is :");
    for (int i=1; i<=10; i++)
    {
        System.out.println( i);
    }

    // print only even number using foor loop
        System.out.println("The even and odd number between 0 to 20 is :");
        for (int e=0; e<=20; e++)
        {
            if (e%2==0)
            {
                System.out.println("Even Number is " + e);
            }
            else
            {
                System.out.println("And Odd number is : " + e);
            }
        }

    }
}
