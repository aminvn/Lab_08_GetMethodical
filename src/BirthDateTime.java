import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        int yearOfBirth = SafeInput.getRangedInt(pipe, "Enter your birth year: ", 1950, 2010);
        System.out.println("You said your birth year is: " + yearOfBirth);

        int monOfBirth = SafeInput.getRangedInt(pipe, "Enter your birth month: ", 1, 12);
        System.out.println("You said your birth month is: " + monOfBirth);

        int dayOfBirth = 0;
        switch(monOfBirth)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dayOfBirth = SafeInput.getRangedInt(pipe, "Enter your birth date: ", 1, 31);
            break;
            case 2: dayOfBirth = SafeInput.getRangedInt(pipe, "Enter your birth date: ", 1, 29);
            break;
            default: dayOfBirth = SafeInput.getRangedInt(pipe, "Enter your birth date: ", 1, 30);
            break;
        }
        System.out.println("Your date of birth is: " + dayOfBirth);

        int hourOfBirth = SafeInput.getRangedInt(pipe, "Enter your hour of birth: ", 1, 24);
        System.out.println("You said your hour of birth is: " + hourOfBirth);

        int minOfBirth = SafeInput.getRangedInt(pipe, "Enter your minute of birth: ", 1, 59);
        System.out.println("You said your minute of birth is: " + minOfBirth);

    }
}
