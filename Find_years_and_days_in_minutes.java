
import java.util.*;
public class Find_years_and_days_in_minutes {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        int minutes = keyboard.nextInt();
        //mins in a day are 60x24=1440
       
        int hours = minutes/60;
        int days = hours/24;
        int  years = days/365;

        int  remainingDays = days % 365;
        
        
        System.out.println(years);
        System.out.println(remainingDays);
        
        
        
        
    }
}
      
