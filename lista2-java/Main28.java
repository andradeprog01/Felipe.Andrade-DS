import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com o seu salário: ");
        double sal = sc1.nextDouble();
        System.out.println("Entre com o valor da parcela: ");
        double par = sc1.nextDouble();
        
        double per_sal = (sal*0.30);
        
        if (par<per_sal)
        {
            System.out.println("Seu emprestimo foi aprovado!");
        }
        else
        {
            System.out.println("Seu emprestimo foi recusado!");
        }
        
        sc1.close();
    }
}
