import java.util.Scanner; 

public class Main9 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        
        System.out.println("Entre com o primeiro número: ");
        int num1 = sc1.nextInt();
        System.out.println("Entre com o segundo número: ");
        int num2 = sc1.nextInt();
        
        if (num1 % num2 == 0)
        {
            System.out.println("O primeiro número ["+num1+"] é multiplo do segundo número ["+num2+"]");
        }
        
        else 
        {
            System.out.println(num1 + " não é múltiplo de " + num2);
        }
        
        
        
        
        sc1.close(); 
    }
}
