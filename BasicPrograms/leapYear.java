package BasicPrograms;
import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if((( year % 4 == 0 ) && ( year % 100 != 0 )) || (year % 400 == 0 )){
            System.out.println("Is Leap year");
        }else{
            System.out.println("Not Leap Year");
        }
    }
}
