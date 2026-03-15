import java.util.Scanner; 

public class Main18 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        
        System.out.println("Entre com a quantidade de KWH: ");
        int kw = sc1.nextInt();
        
        if (kw<100)
        {
            double valor = kw*0.20;
            System.out.println("O valor final a ser pago é: ["+valor+"]");
        }
        else if (kw>=100)
        {
            double valor = kw*0.25;
            System.out.println("O valor final a ser pago é valor: ["+valor+"]");
        }
        

        
   
        
        
        
        
        sc1.close(); 
    }
}
