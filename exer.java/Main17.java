import java.util.Scanner; 

public class Main17 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com sua nota (0 a 10): ");
        int nota = sc1.nextInt();
        System.out.println("Entre com sua frequência (0 a 100): ");
        int freq = sc1.nextInt();
        
        if (nota>7 && freq>75)
        {
            System.out.println("Voçê está aprovado!");
        }
        else
        {
            System.out.println("Voçê está reprovado!");
        }
        

        
   
        
        
        
        
        sc1.close(); 
    }
}
