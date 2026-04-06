import java.util.Scanner;
public class Main1
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num1 = sc1.nextInt();
		
		System.out.println("contagem de 0 até seu número:");
		
		for(int i=0; i <= num1; i++)
		{
		    System.out.println(i);
		}
	}
}
