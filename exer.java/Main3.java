import java.util.Scanner; 

public class Main3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com um número: ");
        int num = sc1.nextInt();
        
        if (num>0)
        {
            System.out.println("O número é positivo !");
        }
        else if (num<0)
        {
            System.out.println("O número é negativo !");
        }
        else
        {
            System.out.println("O número é 0 !");
        }
        
        sc1.close(); 
    }
}
