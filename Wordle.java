import java.util.*;

public class Wordle
{
    public static void main(String[] args)
    {
        String word = "pizza";
        String guess = "";
        
        while(!guess.equals(word))
        {
            guess = intakeString("Take a guess: "); 
            charScan(word, guess);
        }
        System.out.println("\n" + "You did it, congratulations!" + "\n" + "Impeccable guessing skills!" + "\n" + "\n" + "WOW!" + "\n" + "\n" + "The word is: " + word);
    }
    //This method scans the object word with the guess word.
    public static void charScan(String word, String guess)
    {
        for(int i = 0; i < word.length(); i++)
        {
            //Checks if characters are an exact match.
            if(word.charAt(i) == guess.charAt(i))
            {
                System.out.println(guess.charAt(i) + ":" + " "+ "Exact Match!");
            }
            //Checks if characters are in the word.
            else if(word.contains(String.valueOf(guess.charAt(i))))
            {
                System.out.println(guess.charAt(i) + ":" + " " + "In the word");
            }
            //Communicates that a character is not in the word.
            else
            {
                System.out.println(guess.charAt(i) + ":" + " " + "Not in the word.");
            }
        }
    }
    
    //Method to intake strings.
    public static String intakeString(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String userInput = scanner.nextLine();
        //scanner.close();
        return userInput;
    }
}
