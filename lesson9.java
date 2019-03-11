package lesson9;
import java.util.Scanner;

public class lesson9 {

	public static void main(String[] args) {
		
		System.out.println("Geli Numbar one: ");
		Scanner geli1 = new Scanner(System.in);
		int tiro1 = geli1.nextInt();

		System.out.println("Geli Number two");
		Scanner geli2 = new Scanner(System.in);
		int tiro2 = geli2.nextInt();

		System.out.println("Geli Number three");
		Scanner geli3 = new Scanner(System.in);
		int tiro3 = geli3.nextInt();
		
		System.out.println("Geli Number four");
		Scanner geli4 = new Scanner(System.in);
		int tiro4 = geli4.nextInt();
		
		System.out.println("Geli Number five");
		Scanner geli5 = new Scanner(System.in);
		int tiro5 = geli5.nextInt();
		
		System.out.println("Geli Number six");
		Scanner geli6 = new Scanner(System.in);
		int tiro6 = geli6.nextInt();




		
		int formula = tiro1+tiro2/tiro3*tiro4-tiro5%tiro6;
		System.out.println("5 + 15 / 3 * 2 - 8 % 3    = " + formula);

		
	}

}
