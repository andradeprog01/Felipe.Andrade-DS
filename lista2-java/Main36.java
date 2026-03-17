import java.util.Scanner;

public class Main36 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = sc1.nextInt();
        
        if (num>10 && num<50)
        {
            System.out.println("O número ["+num+"] está entre [10 e 50 ]");
        }
        else
        {
            System.out.println("O número ["+num+"] não está entre [10 e 50 ]");
        }
        sc1.close();
    }
}
