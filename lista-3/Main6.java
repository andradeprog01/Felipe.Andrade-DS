import java.util.Scanner;
public class Main6
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		 
		  int opcao = -1; 

        while (opcao != 0) {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1 - Olá Mundo");
            System.out.println("2 - Oque fazer hoje");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc1.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá! Você escolheu a opção 1.");
                    break;
                case 2:
                    System.out.println("Hoje é um ótimo dia para programar!");
                    break;
                case 0:
                    System.out.println("Saindo do programa... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
		 }
	    
		
	}
}
