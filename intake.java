/**
The methods below can be copypastad to abbreviate the user intake process. 
There are diffirent methods for corresponding data types, so make sure you copy the right one. 
If you use more than one of these in your code, the scanner can stay open. 
If your using only one, you should close it (but I'm not too sure on all that). 
Each method has been tested and works.
**/

//Index:
//1. Strings
//2. Integers
//3. Doubles
//4. Characters
import java.util.*;

public class intake
{
    public static void main(String[]args)
    {
    //To declare a variable that depends on user input, use the methods shown below. The variable entered within the methods parameters is displayed to the user.

    //String test
        String fName = intakeString("Enter your first name: ");

    //Integer test
        int age = intakeInt("Enter your age: ");

    //Double test
        double salary = intakeDouble("Enter your salary: ");

    //Character test
        char symbol = intakeChar("Enter a character: ");
    }
    
//1. Method to intake strings.
    public static String intakeString(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String userInput = scanner.nextLine();
        //scanner.close();
        return userInput;
    }

//2. Method to intake integers.
    public static int intakeInt(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int userInput = scanner.nextInt();
        //scanner.close();
        return userInput;
    }

//3. Method to intake doubles.
    public static double intakeDouble(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        double userInput = scanner.nextDouble();
        //scanner.close();
        return userInput;
    }

//4. Method to intake characters.
    public static char intakeChar(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        char userInput = scanner.next().charAt(0);
        //scanner.close();
        return userInput;
    }
}
