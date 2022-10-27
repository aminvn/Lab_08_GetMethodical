import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);

        boolean hasMoreItems = SafeInput.getYNConfirm(pipe, "Do you have an item to check out? ");
        double sumOfItems = 0;

        while(hasMoreItems)
        {
            double price = SafeInput.getRangedDouble(pipe, "Enter price of your item purchased: ", 0.59, 9.99);
            sumOfItems += price;

            hasMoreItems = SafeInput.getYNConfirm(pipe, "Do you have an item to check out?");
        }
        System.out.printf("Total amount: %.2f", sumOfItems);
    }
}
