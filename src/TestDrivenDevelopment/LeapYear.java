package TestDrivenDevelopment;

/**
 * Created by Mallika Aruva on 2/17/2018.
 */
public class LeapYear {

    public static boolean isLeap(int year) {

        return (year % 4 == 0) && !(year % 100 == 0) || year % 400 == 0;
    }

}
