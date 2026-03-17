import java.util.Scanner;

public class Main33 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com seu peso: ");
        double peso = sc1.nextDouble();
        System.out.println("Entre com sua altura: ");
        double alt = sc1.nextDouble();
        
        double imc = peso/alt;
        
        if (imc<18.5)
        {
            System.out.printf("Você está abaixo do peso!");
        }
        else if (imc>18.5 && imc<24.5)
        {
            System.out.println("Você está no peso ideal!");
        }
        else{
            System.out.println("Você está acima do peso!");
        }
        sc1.close();
    }
}
