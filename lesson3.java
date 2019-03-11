package lesson3;
import java.util.Scanner;

public class lesson3 {

	public static void main(String[] args) {
		System.out.println("geli tirada kowad");
        Scanner geli1 =new Scanner (System.in);
        int tiro1=geli1.nextInt();
        
        System.out.println("geli tirada kowad");
        Scanner geli2 =new Scanner (System.in);
        int tiro2=geli1.nextInt();
        
        int qaacido = tiro1/tiro2;
        System.out.println("3/50 ="+qaacido);
	}

}
