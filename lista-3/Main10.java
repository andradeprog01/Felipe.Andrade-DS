import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		// 10) Repetir frase (for)
		
		
		System.out.println("Entre com a frase: ");
		String frase = sc1.nextLine();
		System.out.println("quantas vezes a frase deve ser repetida: ");
		int rep = sc1.nextInt();
		for (int i = 0 ; i<= rep ; i++)
		{
		    System.out.println(frase);
		}





	}
}