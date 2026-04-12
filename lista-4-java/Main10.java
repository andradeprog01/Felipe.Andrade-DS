import java.util.Scanner;
public class Main10
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		//10) Simulador de Estoque (switch + arrays)
		
		System.out.println("---Simulador de Estoque---");
		int opcao;
		String[] produtos = new String[50];
        double[] precos = new double[50];
        int contador = 0;
		
		do
		{
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Valor Total do Estoque");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc1.nextInt();
            
            switch(opcao)
            {
                case 1:
                    System.out.println("Entre com o nome do produto: ");
                    produtos[contador] = sc1.next();
                    System.out.print("Preço: ");
                    precos[contador] = sc1.nextDouble();
                    contador++;
                    System.out.println("Produto adicionado!");
                    break;

                case 2:
                    double total = 0;
                    System.out.println("\n--- Lista de Produtos ---");
                    for (int i = 0; i < contador; i++) {
                        System.out.println(produtos[i] + ": R$ " + precos[i]);
                        total += precos[i];
                    }
                    System.out.println("VALOR FINAL: R$ " + total);
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } 
            while (opcao != 3);
            
		
		

		








	}
}
