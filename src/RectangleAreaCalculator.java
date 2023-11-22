import java.util.Scanner;

public class RectangleAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Creating a Scanner for User Input
		
		Scanner scanner = new Scanner(System.in);
		// Prompt the user to Input
		System.out.println("Please Enter Length of Rectangle to be calculated.");
		double length1 =scanner.nextDouble();
		//Prompt the user the widht of Rectangle to be calculated
		System.out.println("Please Enter the width of Rectangle to be calculated.");
		double width1 =scanner.nextDouble();
		double area=length1 * width1;
		System.out.println("The Area of Your Rectangele is " +area );
		scanner.close();
		
				
		
		
		
		
		
		
		
	}

}
