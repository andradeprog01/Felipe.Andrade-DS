import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com o valor da compra: ");
        double valor = sc1.nextDouble();
        
        double valor_final = valor + (valor*0.12);
        
        System.out.println("O valor da conta pós tributos federais e estaduais é de ["+valor_final+"]");

        sc1.close();
    }
}
