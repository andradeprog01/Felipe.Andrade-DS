import java.util.Scanner;
public class Main2
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		
	    System.out.println("Entre com seu CPF: (xxx.xxx.xxx.xx)  ");
	    String cpf = sc1.next();
	    
	    
	    if (cpf.length()==14)
	    {
	        System.out.println("Seu CPF é valido!");
	    }
	    else 
	    {
	        System.out.printf("Seu CPF é invalido!");
	    }
	}
}
