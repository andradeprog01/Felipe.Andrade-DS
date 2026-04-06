import java.util.Scanner;
public class Main20
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		// 20) Simulador de ligação (switch)
		 System.out.println("--- MENU DE LIGAÇÃO ---");
        System.out.println("1 - Falar com atendente");
        System.out.println("2 - Deixar um recado");
        System.out.println("3 - Ouvir música de espera");
        System.out.println("4 - Encerrar chamada");
        System.out.print("Escolha uma opção: ");
        
        int opcao = sc1.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Encaminhando para um atendente... Aguarde.");
                break;
            case 2:
                System.out.println("Grave seu recado após o sinal: BEEP!");
                break;
            case 3:
                System.out.println("Tocando: ♫ Tan tan tan nan... ♫");
                break;
            case 4:
                System.out.println("Chamada encerrada. Obrigado!");
                break;
            default:
                System.out.println("Opção inválida. Digite um número de 1 a 4.");
                break;
        }
		
		
		

		
		 
        
		
		
	}
}
