import java.util.Scanner; 

public class Main1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com um número: ");
        int num = sc1.nextInt();
        
        if (num%2==0)
        {
            System.out.printf("O número ["+num+"] é par !");
        }
        else
        {
            System.out.println("O número ["+num+"] é impar !");
        }

        
   
        
        
        
        
        sc1.close(); 
    }
}
