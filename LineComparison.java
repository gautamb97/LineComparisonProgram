import java.util.*;

public class LineComparison {
	
	static Scanner input = new Scanner(System.in);
	float x1, x2, y1, y2;
	double lengthOfLine;
	double lengthOfSecondLine;
	double length;
	public void calculatingLengthOfLine() {
		System.out.println("Enter value for x1: ");
		x1 = input.nextFloat();
		System.out.println("Enter value for y1: ");
		y1 = input.nextFloat();
		System.out.println("Enter value for x2: ");
		x2 = input.nextFloat();
		System.out.println("Enter value for y2: ");
		y2 = input.nextFloat();
	}
	
	public double calculationOfLength() {
		calculatingLengthOfLine();
		length = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		return length;
	}
	
	public void operation() {
		System.out.println("Enter first line co-ordinates");
		for(int count=0; count <=1; count ++)
			if(count < 1) {
				lengthOfLine = calculationOfLength();
			}else { 
				System.out.println("Enter Second line co-ordinates");
				lengthOfSecondLine = calculationOfLength();
			}
		System.out.println("Length of line one : " + lengthOfLine);
		System.out.println("Length of line two : " + lengthOfSecondLine);
		}
	
	public void checkingEqualityOfTwoLines() {
		String firstLine = Double.toString(lengthOfLine);
		String secondLine = Double.toString(lengthOfSecondLine);
		if(firstLine.equals(secondLine))
			System.out.println("Both the lines are having eqaul lengths");
		else
			System.out.println("Both the lines are not equal in length");
	}
	
	public void comparisonOfTwoLines() {
		Double firstLineValue = Double.valueOf(lengthOfLine);
		Double secondLineValue = Double.valueOf(lengthOfSecondLine);
		if (firstLineValue == secondLineValue)
			System.out.println("Both are equal");
		else if (firstLineValue < secondLineValue)
			System.out.println("Length of line one less than line two");
		else
			System.out.println("Length of line one is greater than line two");		
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		LineComparison calculation = new LineComparison();
		calculation.operation();
		calculation.checkingEqualityOfTwoLines();
		calculation.comparisonOfTwoLines();
	}
}
