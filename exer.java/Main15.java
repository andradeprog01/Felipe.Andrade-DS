import java.util.Scanner; 

public class Main15 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com sua idade: ");
        int id = sc1.nextInt();
        
        if (idade<=12)
        {
            System.out.println("Voçê é criança");
        }
        else if (idade>=13 && idade<=17)
        {
            System.out.println("Voçê é adolescente");
        }
        else if (idade>=18 && idade<=59)
        {
            System.out.println("Voçê é adulto");
        }
        else
        {
            System.out.println("Voçê é idoso");
        }
        
        
        sc1.close(); 
    }
}
