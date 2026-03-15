import java.util.Scanner; 

public class Main8 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com o valor do produto: ");
        double prod = sc1.nextInt();
        
        if(prod>=100)
        {
            prod = prod - (prod*0.20);
            System.out.println("O valor final do seu produto é de ["+prod+"]");
        }
        else if (prod<100)
        {
            prod = prod - (prod*0.10);
            System.out.println("O valor final do seu produto é de ["+prod+"]");
        }
        
        
        sc1.close(); 
    }
}
