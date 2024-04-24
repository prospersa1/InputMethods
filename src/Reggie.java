import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //declarations
        String ssn = "";
        String ucId ="";
        String zipCode = "";

        ssn = SafeInput.getRegExString(in, "Enter your full Social Security Number (XXX-XX-XXXX)", "\\d{3}-\\d{2}-\\d{4}");
        ucId = SafeInput.getRegExString(in, "Enter your UC student M number (MXXXXX or mXXXXX)", "(M|m)\\d{5}");
        zipCode = SafeInput.getRegExString(in, "Enter your zipcode in the format (XXXXX-XXXX)", "\\d{5}-\\d{4}");

        System.out.println("\nYour Social Security Number is " + ssn + ", UC Student M number is " + ucId + ", and Zip code is " + zipCode);

    }
}
