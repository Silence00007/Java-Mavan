import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Switch_case_week {
    public static void main(String[] args) {

        int Week_day= 4;
        System.out.println("the week name is : ");
        switch (Week_day)
        {
            case 1 :System.out.println("MONDAY"); break;
            case 2 :System.out.println("TUSEDAY"); break;
            case 3 :System.out.println("WEDNESSDAY"); break;
            case 4 :System.out.println("THURSDAY"); break;
            case 5 :System.out.println("FRIDAY"); break;
            case 6 :System.out.println("SATURDAY"); break;
            case 7 :System.out.println("SUNDAY"); break;
            default:
                System.out.println( "INVALID WEEK");
        }



    }


}
