import java.util.*;

public class LineComparison {
	
	static Scanner input = new Scanner(System.in);
	int LengthOfLine;
	int LengthOfSecondLine;
	public void calculatingLengthOfLine() {
		System.out.println("Enter value for x1: ");
		int x1 = input.nextInt();
		System.out.println("Enter value for y1: ");
		int y1 = input.nextInt();
		System.out.println("Enter value for x2: ");
		int x2 = input.nextInt();
		System.out.println("Enter value for y2: ");
		int y2 = input.nextInt();
		LengthOfLine = (int)Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println("Length of line is: " + LengthOfLine);
	}
	
	public void calculatingLengthOfLineTwo() {
		System.out.println("Enter value for x3: ");
		int x3 = input.nextInt();
		System.out.println("Enter value for y3: ");
		int y3 = input.nextInt();
		System.out.println("Enter value for x4: ");
		int x4 = input.nextInt();
		System.out.println("Enter value for y4: ");
		int y4 = input.nextInt();
		LengthOfSecondLine = (int)Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
		System.out.println("Length of line two is: " + LengthOfSecondLine);
	}
	
	public void checkingEqualityOfTwoLines() {
		String FirstLineLength = Integer.toString(LengthOfLine);
		String SecondLineLength = Integer.toString(LengthOfSecondLine);
		if(FirstLineLength.equals(SecondLineLength))
			System.out.println("Both the lines are having eqaul lengths");
		else
			System.out.println("Both the lines are not equal in length");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		LineComparison calculation = new LineComparison();
		calculation.calculatingLengthOfLine();
		calculation.calculatingLengthOfLineTwo();
		calculation.checkingEqualityOfTwoLines();
	}

}
