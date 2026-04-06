import java.util.Scanner;
public class Main4
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entre com um número e receba sua respectiva tabuada: ");
		int num = sc1.nextInt();
		
		for (int i = 1 ; i<=10 ; i++)
		{
		    int resul = num*i;
		    System.out.println(num + " x " + i + " = " + resul);
		}
	    
	    
		
	}
}
