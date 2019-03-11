package lesson6;
import java.util.Scanner;

public class lesson6 {

	public static void main(String[] args) {
		 Scanner Kasoosaar = new Scanner(System.in);
	        int n1;        
	        int n2;   
	      
	        System.out.print( "Geli first  number: " );       
	        n1 = Kasoosaar.nextInt();   
	 
	        System.out.print( "Geli second number: " );         
	        n2 = Kasoosaar.nextInt();                
	        
	        if ( n1 == n2 )           
	        	System.out.printf( "%d == %d\n", n1, n2 );  
	        if ( n1 != n2 )          
	            System.out.printf( "%d != %d\n", n1, n2 );  
	        if ( n1 < n2 )          
	            System.out.printf( "%d < %d\n", n1, n2 );  
	        if ( n1 > n2 )          
	            System.out.printf( "%d > %d\n", n1, n2 );  
	        if ( n1 <= n2 )          
	            System.out.printf( "%d <= %d\n", n1, n2 );  
	        if ( n1 >= n2 )          
	            System.out.printf( "%d >= %d\n", n1, n2 );




	}

}
