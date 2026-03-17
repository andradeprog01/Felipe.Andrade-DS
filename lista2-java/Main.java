import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        
        System.out.print("Nota 1 e Peso 1: ");
        double n1 = sc1.nextDouble();
        double p1 = sc1.nextDouble();

        System.out.print("Nota 2 e Peso 2: ");
        double n2 = sc1.nextDouble();
        double p2 = sc1.nextDouble();

        System.out.print("Nota 3 e Peso 3: ");
        double n3 = sc1.nextDouble();
        double p3 = sc1.nextDouble();

        
        double media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

       
        System.out.printf("A média ponderada é: "+ media);

        sc1.close();
    }
}
