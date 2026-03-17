import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero inteiro: ");
        int num1 = sc1.nextInt();
        System.out.println("Entre com o segundo numero inteiro: ");
        int num2 = sc1.nextInt();
        int dif = num1-num2;
        System.out.println("A diferença entre os 2 numeros é de: ["+dif+"]");
        
        sc1.close();
    }
}
