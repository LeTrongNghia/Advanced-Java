import java.util.InputMismatchException;
import java.util.Scanner;

public class Running {

	public static void printResult(float[] rs) {
		if (rs[0] == 1)
			System.out.println("infinity");
		else if (rs[1] == 1)
			System.out.println("Has no solution");
		else
			System.out.println("Result x = " + rs[2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("a = ");
			float a = input.nextFloat();
			System.out.print("\nb = ");
			float b = input.nextFloat();
			LinearEquation equa = new LinearEquation(a,b);
			float[] rs = equa.sloveEquation();
			printResult(rs);
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
