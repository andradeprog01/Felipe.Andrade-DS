import java.util.Scanner; 

public class Main13 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com sua nota: ");
        int nota = sc1.nextInt();
        
        if(nota<0 && nota>10)
        {
            System.out.println("Sua nota é valida !");
        }
        else 
        {
            System.out.println("Sua nota é invalida !");
        }
        
        
        sc1.close(); 
    }
}
