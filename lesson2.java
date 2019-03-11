package lesson2;
import java.util.Scanner;

public class lesson2 {

	public static void main(String[] args) {
		
		System.out.println("geli tirada kowad:");
		Scanner geli1 = new Scanner(System.in);
		int tiro1 = geli1.nextInt();
		
		System.out.println("geli tirada labaad:");
		Scanner geli2 = new Scanner(System.in);
		int tiro2 = geli1.nextInt();
		
		
		int qaacido = tiro1*tiro2;
		System.out.println("74+36="+qaacido);

	}

}
