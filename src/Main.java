import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );

       /* sayHello();

        sayHello(13);

        sayMsg("Damn it Jacob!", 35);


        int favNum = 18;

        int doubledInt = doubleIt(favNum);

        System.out.println("Double is: " + doubledInt + ".");


        int favNum = SafeInput.getRangedInt(in, "Enter your favorite number", 1, 100);

        double salary = getDouble(in, "Enter your salary");
        System.out.println("Your salary is " + salary + ".");

        String  fName = getNonZeroLengthString(in,"Enter a non zero length string like your name");
        System.out.println("Hello " +fName + ".");

        // System.out.println("You said your fav num is " + getRangedInt(in,"Enter your favorite number", 1, 100)+ ".");

        String ssn = getRegExString(in, "Enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your ssn is " +ssn + ".");

        */
        boolean isRaining = getYNConfirm( in, "Is it raining?" );
        System.out.println( "You said, is it raining?: " + isRaining + "." );
    }


    public static void sayHello() {
        System.out.println( "Hello!" );
    }

    public static void sayHello(int times) {
        for (int i = 0; i <= times; i++)
            System.out.println( "Hello!" );
    }

    public static void sayMsg(String msg, int times) {
        for (int i = 0; i <= times; i++)
            System.out.println( msg );
    }

    public static int doubleIt(int num) {
        int retVal = 0;

        retVal = num * 2;

        return retVal;
    }

    /**
     * Return a user supplied int with the specified range
     *
     * @param pipe   The Scanner instance to use for the console input
     * @param prompt A String that tell the user what to input
     * @param low    The lower bound for the range of valid values
     * @param high   The higher bound for the range of valid values
     * @return An integer within the range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {

            System.out.print( prompt + "[" + low + "-" + high + "] : " );
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    System.out.println( "\nYou said your ret Val is " + retVal + "." );
                    done = true;
                } else {
                    System.out.println( "You said your ret Val is " + retVal + " but that is out out of range[" + low + "-" + high + "]" );

                }

            } else {
                trash = pipe.nextLine();
                System.out.println( "You must enter an integer not " + trash + "." );
            }

        } while (!done);

        return retVal;
    }

    /**
     * Return a user supplied int
     *
     * @param pipe   The Scanner instance to use for the console input
     * @param prompt A String that tell the user what to input
     * @return An arbitrary int within the range
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {

            System.out.print( prompt + " : " );
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                System.out.println( "\nYou said your ret Val is " + retVal + "." );
                done = true;

            } else {
                trash = pipe.nextLine();
                System.out.println( "You must enter an integer not " + trash + "." );
            }

        } while (!done);

        return retVal;
    }

    /**
     * Return a user supplied double
     *
     * @param pipe   The Scanner instance to use for the console input
     * @param prompt A String that tell the user what to input
     * @return An arbitrary double within the range
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {

            System.out.print( prompt + " : " );
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                System.out.println( "\nYou said your ret Val is " + retVal + "." );
                done = true;

            } else {
                trash = pipe.nextLine();
                System.out.println( "You must enter an integer not " + trash + "." );
            }

        } while (!done);

        return retVal;
    }

    /**
     * Return a user supplied double with the specified range
     *
     * @param pipe   The Scanner instance to use for the console input
     * @param prompt A String that tell the user what to input
     * @param low    The lower bound for the range of valid values
     * @param high   The higher bound for the range of valid values
     * @return An arbritrary double within the range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {

            System.out.print( prompt + "[" + low + "-" + high + "] : " );
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    System.out.println( "\nYou said your ret Val is " + retVal + "." );
                    done = true;
                } else {
                    System.out.println( "You said your ret Val is " + retVal + " but that is out out of range[" + low + "-" + high + "]" );

                }

            } else {
                trash = pipe.nextLine();
                System.out.println( "You must enter an integer not " + trash + "." );
            }

        } while (!done);

        return retVal;
    }

    /**
     * get a string with at least one character
     *
     * @param pipe   The Scanner instance to use for the console input
     * @param prompt A String that tell the user what to input
     * @return A String that's at least one character
     */
    public static String getNonZeroLengthString(Scanner pipe, String prompt) {
        String retVal = "";
        boolean done = false;
        String trash = "";

        do {

            System.out.print( prompt + ": " );
            retVal = pipe.nextLine();
            if (retVal.length() != 0) {

                done = true;

            } else // you have a zero length string
            {

                System.out.println( "You must enter at least one character not " + trash + "." );
            }

        } while (!done);

        return retVal;
    }

    /**
     * get a string that matches a Regular Expression pattern like ###-##-#### \d{3}-\{2}-\d{4}
     *
     * @param pipe   The Scanner instance to use for the console input
     * @param prompt A String that tell the user what to input
     * @return A String that's at least one character
     */

    public static String getRegExString(Scanner pipe, String prompt, String pattern) {
        String retVal = "";
        boolean done = false;
        String trash = "";

        do {

            System.out.print( prompt + ": " );
            retVal = pipe.nextLine();
            if (retVal.matches( pattern )) {

                done = true;

            } else // you have a zero length string
            {

                System.out.println( "What you entered does not match the pattern, not " + trash + "." );
            }

        } while (!done);

        return retVal;
    }

    /**
     * Takes a Y or an N and returns true or false respectively
     *
     * @param pipe   Scanner to use for console input
     * @param prompt String that indicates what to input
     * @return A boolean true or false based on the Y or N input
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean retVal = false;
        boolean done = false;
        String inputYN = "";
        String trash = "";

        do {

            System.out.print( prompt + " [Y/N]: " );
            inputYN = pipe.nextLine();
            if (inputYN.equalsIgnoreCase( "Y" )) {
                retVal = true;
                done = true;

            } else if (inputYN.equalsIgnoreCase( "N" )) {
                done = true;
                retVal = false;
            } else // Not Y or N inputted
            {

                System.out.println( "You must enter either Y or N." );
            }

        } while (!done);

        return retVal;
    }
}