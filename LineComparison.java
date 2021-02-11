import java.util.*;

public class LineComparison {
	
	static Scanner input = new Scanner(System.in);
	double LengthOfLine;
	public void calculatingLengthOfLine() {
		System.out.println("Enter value for x1: ");
		int x1 = input.nextInt();
		System.out.println("Enter value for y1: ");
		int y1 = input.nextInt();
		System.out.println("Enter value for x2: ");
		int x2 = input.nextInt();
		System.out.println("Enter value for y2: ");
		int y2 = input.nextInt();
		LengthOfLine = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println("Length of line is: " + LengthOfLine);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		LineComparison calculation = new LineComparison();
		calculation.calculatingLengthOfLine();
	}

}
