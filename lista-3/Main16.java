import java.util.Scanner;
public class Main16
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		// 16) Multiplicar números usando somas (while)
		System.out.print("Digite o primeiro número: ");
        int num1 = sc1.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc1.nextInt();

        int resultado = 0;
        int contador = 0;

        
        while (contador < num2) {
            resultado += num1;
            contador++;
        }

        System.out.println("O resultado da multiplicação é: " + resultado);
		
	}
}
