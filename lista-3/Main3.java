import java.util.Scanner;
public class Main3
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
	    
	    int soma=0;
	    int num;
	    System.out.println("Entre com um numero: ");
	    num = sc1.nextInt();
	    
	    while (num!=0)
	    {
	        soma = soma+num;
	        System.out.println("Entre com outro número (ou 0 ´para ver o resultado:) ");
	        num = sc1.nextInt();
	    }
	    
	    System.out.println("O vslor final é de "+soma);
		
	}
}
