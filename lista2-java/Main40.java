import java.util.Scanner;

public class Main40 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Digite o valor da venda: R$ ");
        double valorVenda = sc1.nextDouble();
        double comissao;

        
        if (valorVenda < 1000) {
            comissao = valorVenda * 0.04; 
        } 
        else if (valorVenda <= 5000) {
            comissao = valorVenda * 0.06; 
        } 
        else {
            comissao = valorVenda * 0.08; 
        }

        System.out.printf("O valor da comissão é: R$ %.2f%n", comissao);
        System.out.printf("Total com comissão: R$ %.2f%n", valorVenda + comissao);

        sc1.close();
    }
}
