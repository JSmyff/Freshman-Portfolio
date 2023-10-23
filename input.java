/**
The methods below can be copypastad to abbreviate the user input process. 
There are diffirent methods for corresponding data types, so make sure you copy the right one. 
If you use more than one of these in your code, the scanner can stay open. 
If your using only one, you should close it.
Each method has been tested and works.
**/

//Index:
//1. Strings
//2. Integers
//3. Doubles
//4. Characters
import java.util.*;

public class input
{
    public static void main(String[]args)
    {
    //To declare a variable that depends on user input, use the methods shown below. The variable entered within the methods parameters is displayed to the user.

    //String test
        String fName = inputString("Enter your first name: ");

    //Integer test
        int age = inputInt("Enter your age: ");

    //Double test
        double salary = inputDouble("Enter your salary: ");

    //Character test
        char symbol = inputChar("Enter a character: ");
    }
    
//1. Method to input strings.
    public static String inputString(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String userInput = scanner.nextLine();
        //scanner.close();
        return userInput;
    }

//2. Method to input integers.
    public static int inputInt(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int userInput = scanner.nextInt();
        //scanner.close();
        return userInput;
    }

//3. Method to input doubles.
    public static double inputDouble(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        double userInput = scanner.nextDouble();
        //scanner.close();
        return userInput;
    }

//4. Method to input characters.
    public static char inputChar(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        char userInput = scanner.next().charAt(0);
        //scanner.close();
        return userInput;
    }
}
