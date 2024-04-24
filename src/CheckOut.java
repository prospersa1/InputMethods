import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //declarations
        double itemPrice = 0.0;
        double totalCost = 0.0;

        do {
            itemPrice = SafeInput.getRangedDouble(in, "What is the price of your item", 0.5, 99.99);
            totalCost += itemPrice;

        } while (SafeInput.getYNConfirm(in, "Do you have more items to add?"));

        System.out.printf("\nThe total cost of your item(s) is: $%.2f", totalCost);
    }
}
