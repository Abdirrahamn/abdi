package lesson8;
import java.util.Scanner;

public class lesson8 {

	public static void main(String[] args) {
		
		System.out.println("Geli Numbar 1: ");
		Scanner geli1 = new Scanner(System.in);
		int tiro1 = geli1.nextInt();

		System.out.println("Geli Number 2");
		Scanner geli2 = new Scanner(System.in);
		int tiro2 = geli2.nextInt();

		System.out.println("Geli Number 3");
		Scanner geli3 = new Scanner(System.in);
		int tiro3 = geli3.nextInt();
		
		System.out.println("Geli Number 4");
		Scanner geli4 = new Scanner(System.in);
		int tiro4 = geli4.nextInt();


		
		int qaacido = tiro1+(-tiro2*tiro3)/tiro4;
		System.out.println("20 + (-3*5) / 8   = " + qaacido);
		
		

	}

}
