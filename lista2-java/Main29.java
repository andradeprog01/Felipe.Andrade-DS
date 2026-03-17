import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com seu salario bruto: ");
        double sal = sc1.nextDouble();
        
        if (sal<2000)
        {
            sal = sal - (sal*0.08);
            System.out.println("Seu salario liquido é de: ["+sal+"]");
        }
        else if (sal>2000 && sal<3000)
        {
            sal = sal - (sal*0.09);
            System.out.println("Seu salario liquido é de: ["+sal+"]");
        }
        else
        {
            sal = sal - (sal*0.11);
            System.out.println("Seu salario liquido é de: ["+sal+"]");
        }
        sc1.close();
    }
}
