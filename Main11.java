import java.util.Scanner; 

public class Main11 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        
        System.out.print("Entre com o ano: ");
        int ano = sc1.nextInt();
        
        if (ano % 4 == 0 && ano % 100 != 0)
        {
            System.out.println(ano+ ", é um ano bissexto !");
        }
        else
        {
            System.out.println(ano+ ", não é um ano bissexto !");
        }
        
        
        sc1.close(); 
    }
}
