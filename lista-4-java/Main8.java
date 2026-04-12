import java.util.Scanner;
public class Main8
{
	public static void main(String[] args) {
	Scanner sc1 = new Scanner(System.in);
	//8) Jogo: Adivinhe o Número com dicas
	
	int numC= 8;
	int tentativas = 1 ; 
	
	System.out.println("Tente adivinhar o número de 1 a 10: ");
    int numT = sc1.nextInt();
    
    
    while(numT!=numC)
    {
        tentativas++;
        if (numT<numC)
        {
            System.out.println("Dica: O número é MAIOR.");
        }
        else if (numT>numC)
        {
            System.out.println("Dica: O número é MENOR.");
        }
       
        System.out.println("Tente novamente: ");
        numT= sc1.nextInt();
            
            
        
    }
    
	System.out.println("Voçê acertou em " +tentativas + " tentativas, número secreto era 8!");
	
	}
}
