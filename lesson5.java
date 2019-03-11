package Triangle;
import java.util.Scanner;

public class lesson5 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner (System.in);
		
		
		System.out.println("geli balaca Triangle:");
		double base = Scanner.nextDouble();
		
		System.out.println("geli dhererka Triangle");
        double dhererka = Scanner.nextDouble();
        
        Double  area = (base*dhererka)/2;
        System.out.println("area of Triangle is: "+area);
	}

}
