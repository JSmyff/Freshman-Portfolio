import java.util.Scanner;

public class Triangle 
{
    public static void main(String[] args) 
    {
        Scanner stdin = new Scanner(System.in);    
        System.out.print("Enter triangle size: ");
        int size = Integer.parseInt(stdin.nextLine());
        char symbol = intakeChar("Enter symbol to print: ");
        printTriangle(size, symbol);
    }

    private static void printTriangle(int size, char symbol) 
    {
        //These variables are initialized to be used in the for loops below.
        int star = size;
        int dot = 0;

        //This for loops has two for loops within it that both print on the same line.
        for(int i = 0; i < size; i++)
        {
            //This is a decreasing for loop that prints "star" amount stars and decreases by one each iteration.
            for(int j = star; j > 0; j--)
            {
                System.out.print(symbol + " ");
            }
            //This for loop prints "dot" amount of dots and increases by one each iteration.
            for(int j = 0; j < dot; j++)
            {
                System.out.print(". ");
            }
            star --;
            dot ++;
            System.out.println();
        }
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
