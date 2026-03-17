import java.util.Scanner;

public class Main34 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double n1 = sc1.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double n2 = sc1.nextDouble();
        
        double med = (n1+n2)/2;
        
        if (med>=6)
        {
            System.out.println("Você está aprovado!");
        }
        else
        {
            System.out.println("Você está reprovado!");
        }
        sc1.close();
    }
}
