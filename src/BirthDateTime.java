import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // declarations
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;
        int maxDays = 0;

        birthYear = SafeInput.getRangedInt(in, "Please enter the year you were born", 1921, 2020 );
        birthMonth = SafeInput.getRangedInt(in, "Please enter the month you were born", 1, 12 );

        //to get the day for the different months
        switch (birthMonth)
        {
            case 2: maxDays = 29;   //this is to account for a leap year instance
            break;
            case 4,6,9,11: maxDays = 30;
            break;
            default: maxDays = 31;
            break;
        }
        birthDay = SafeInput.getRangedInt(in, "Please enter the day you were born", 1, maxDays);
        birthHour = SafeInput.getRangedInt(in, "Please enter the hour you were born",1, 24);
        birthMinute = SafeInput.getRangedInt(in, "Please enter the minute you were born",1, 59);

        System.out.println("\nYou were born in the year " + birthYear + ", the month "
                + birthMonth + ", on the " + birthDay + " day, in the " + birthHour + " hour and "
                + birthMinute + " minute.");
    }
}
