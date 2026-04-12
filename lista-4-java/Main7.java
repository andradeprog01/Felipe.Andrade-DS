import java.util.Scanner;
public class Main7
{
	public static void main(String[] args) {
	    Scanner sc1 = new Scanner(System.in);
		//7) Lista de Compras com Totalização (switch + while)
		int op = 0;
		double totalGeral = 0.0;
        int quantidadeItens = 0;
		System.out.println("---Sistema de compras---");
		
		while(op!=3)
		{
		    System.out.println("\n1 - Adicionar Preço de Item");
            System.out.println("2 - Ver Total Atual");
            System.out.println("3 - Finalizar e Sair");
            System.out.print("Escolha: ");
            op = sc1.nextInt();
            
            switch(op)
            {
                case 1:
                    System.out.print("Digite o valor do produto: R$ ");
                    double preco = sc1.nextDouble();
                    totalGeral += preco;
                    quantidadeItens++;
                    System.out.println("Valor somado ao total!");
                    break;
                case 2:
                    System.out.printf("\nItens registrados: "+quantidadeItens);
                    System.out.printf("\nTotal acumulado: "+totalGeral);
                    break;
                case 3:
                    System.out.printf("\nResumo Final: itens | Total: ", quantidadeItens, totalGeral);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
		}
		
		
	}
}
