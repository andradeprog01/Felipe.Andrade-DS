import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");
        int id = sc1.next.Int();
        
        if (id>=18)
        {
            System.out.println("Você é adulto!");
        }
        else
        {
            System.out.println("Você não é adulto!");
        }
        sc1.close();
    }
}
