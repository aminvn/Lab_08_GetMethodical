import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);

        int favInt = SafeInput.getInt(pipe, "Enter your favorite integer");
        System.out.println("You said your fav num is: " + favInt);

        double favDouble = SafeInput.getDouble(pipe, "Enter your favorite double: ");
        System.out.println("Your favorite integer recieved: " + favDouble);

    }
}
