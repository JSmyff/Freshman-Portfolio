import java.util.Scanner;
import java.lang.Math;

public class quadraticSolve{
public static void main(String[] args) {
        //user input block
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the coefficients of your linear equation  "  + "(Ax+Bx+c=0)");
        System.out.print("A: ");
        double A = sc.nextDouble();
        System.out.print("B: ");
        double B = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        //Solve block
        double x1 = (-B + (Math.sqrt(B * B - 4 * A * c))) / (2 * A);
        double x2 = (-B - (Math.sqrt(B * B - 4 * A * c))) / (2 * A);
        System.out.println("x=" + x1 + " and " + "x=" + x2);
        //Note: Program doesn't solve for complex numbers.
	}
}
