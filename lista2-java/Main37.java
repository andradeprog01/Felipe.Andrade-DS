import java.util.Scanner;

public class Main37 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        double num1 = sc1.nextDouble();
        System.out.println("Entre com o segundo número:");
        double num2 = sc1.nextDouble();
        
        if (num1>0 && num2>0)
        {
            double soma = (num1+num2);
            System.out.println("A soma dos 2 números é de ["+soma+"]");
        }
        else
        {
            System.out.println("Valores invalidos!");
            System.exit(0);
        }
        sc1.close();
    }
}
