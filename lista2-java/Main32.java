import java.util.Scanner;

public class Main32 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com o valor em reais: ");
        double valor_r = sc1.nextInt();
        
        double valor_d = (valor_r)/5.21;
        
        System.out.println("o valor convertido para dolares é de ["+valor_d+"]");

        
        sc1.close();
    }
}
