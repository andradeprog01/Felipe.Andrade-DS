import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc1=new Scanner (System.in);
		System.out.println("Entre com um numero: ");
		
		int num1=sc1.nextInt();
		if (num1%2==0){
    		     System.out.println("o número "+num1+" é par.");
    		 }
		 else {
    		 
    		     System.out.println("o número "+num1+" é impar.");
    		  }
	
		
	}
}
