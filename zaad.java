package zaad;
import java.util.Scanner;

public class zaad {

	public zaad() {
		
	}
     static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
	  System.out.println("");
	  
	  
	  
		System.out.println("ZAAD SERVICES");
		
		
		
		System.out.println("1. Itus hadhaagaaga");
		System.out.println("2. Lacag Dirid");
		System.out.println("3. Lacag Labixid");
		System.out.println("4. Ku Iibso");
		System.out.println("5. I tus Dhaqdhaqaaq");
		System.out.println("6. E-Voucher");
		System.out.println("7. Naareynta");
		System.out.println("8. Dara-Salaam Bank");
		System.out.println("9. TAAJ");
		System.out.println("10. KaBax");
		
	
		
       int x;
       x = sc.nextInt();
       
       if (x==1) {
			
		System.out.println("Hadhaagaagu waa $122.50");
	
		}
      
       if (x==2) {
			
   		System.out.println("Fadlan Geli Mobile-Ka");
   		Scanner geli=new Scanner(System.in);
   		int tiro1=geli.nextInt();
   		System.out.println("Fadlan Geli Lacagta");
   		Scanner geli1=new Scanner(System.in);
   		int tiro=geli.nextInt();
   		System.out.println("Ma hubtaa in aad u dirayso"+"\n1.HAA"+"\n2.Maya");
   	
   		}
       if (x==3) {
			
      		System.out.println("Faldan geli aqoonsiga laanta");
      		Scanner geli=new Scanner(System.in);
       		int tiro2=geli.nextInt();
       		System.out.println("Faldan Geli aqoonsiga laanta");
       		Scanner geli2=new Scanner(System.in);
       		int tiro=geli.nextInt();
       		System.out.println("Ma hubtaa in aad kala baxdid"+"\n1.HAA"+"\n2.Maya");
       		
      		}
       if (x==4) {
			
      		System.out.println("Faldan Geli aqoonsiga ganacsiga");
      		Scanner geli=new Scanner(System.in);
       		int tiro3=geli.nextInt();
       		System.out.println("Faldan Geli Lacagta aad udiraysid");
       		Scanner geli3=new Scanner(System.in);
       		int tiro=geli.nextInt();
       		System.out.println("Ma hubtaa in aad u idaysid"+"\n1.HAA"+"\n2.Maya");
       		
      		} if (x==5) {
    			
      	   		System.out.println("Itus Dhaqdhaqaaq"+"\n 1.Dhaqdhaqaaq Kaliya"+" \n 2.Warbixin Kooban"+"\n 3.Email Me My ACtivity"+"\n 4.KaBax" );
      	  
      		Scanner geli3=new Scanner(System.in);
      	 	int tiro3=geli3.nextInt();
      		System.out.println("1.Fadlan Geli aqoonsiga lacag diridda");
       		
       		
       		
       		
      	   		} if (x==6) {
      				
      	     		
      	   			System.out.println("E-Voucher"+"\n 1.Ku shubo Lacag"+"\n 2.Ugu shub Qof Kale"+"\n 3.Internet bundle Recharge"+"\n 4.KaBax");
      	   		Scanner geli6=new Scanner(System.in);
      	   			int tiro6=geli6.nextInt();
      	      		System.out.println("1.Fadlan Geli lacagta");
      	      		
      	      	Scanner geli7=new Scanner(System.in);
  	   			int tiro7=geli6.nextInt();
  	      		System.out.println("2.Fadlan Geli mobile-ka");
      	     	 		
      	     		} if (x==7) {
      	  			
      	     	   		System.out.println("Maareynta"+ " \n 1.Bedel lambarka sirta ah"+"\n 2.Bedel SIM-ka "+"\n 3.Bedel luuqadda"+"\n 4.Wargelin Mobile lumay"+"\n 5.KaBax");
      	     	   	
      	     	   		}  if (x==8) {
      	     				
      	     	    		System.out.println("Dara-salaam bank"+"\n 1.Itus hadhaagaaga"+"\n 2.Lacag dhigasho"+"\n 3.Lacag qaadasho"+"\n 4.E-Deposit"+"\n 5.ACC-TO-ACC"+"\n 6.BedelPIN-kaBangiga"+"\n 7.Furo KAAFI Mobile Banking"+"\n 8.KaBax ");
      	     	    	
      	     	    		}  if (x==10) {
      	     	 			
      	     	    	   		System.out.println("Thank you, Goodbye");
      	     	    	   	
      	     	    	   		}  if (x==9) {
      	     	    				
      	     	    	    		System.out.println("TAAJ"+"\n 1.Xawaalad Dibada ah"+"\n 2.Xawaalad gudaha ah"+"\n 3.KaBax");
      	     	    	    	
      	     	    	    		}
}
}
