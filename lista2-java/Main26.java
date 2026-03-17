import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com um Número: ");
        int num = sc1.nextInt();
        
        if (num%2==0 && num%5==0)
        {
            System.out.println(num +" é par e é divisivel por 5 !");
        }
        else if (num%2 !=0 && num%5==0)
        {
            System.out.println(num +" é impar e é divisivel por 5 !");
        }
        else if (num%2==0 && num%5 !=0) 
        {
            System.out.println(num +" é par e não é divisivel por 5 !");
        }
        else
        {
            System.out.println(num +" é impar e não é divisivel por 5 !");
        }
        sc1.close();
    }
}
