package side;
import java.util.Scanner;

public class side {

	public static void main(String[] args) {
		
		{
			System.out.println("Enter Side of Square:");
		       Scanner Scanner = new Scanner(System.in);
		     
		       double side = Scanner.nextDouble();
		       
		       double area = side*side; 
		       System.out.println("Area of Square is: "+area);
			}
	}

}
