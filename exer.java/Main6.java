import java.util.Scanner; 

public class Main6 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com sua idade: ");
        int idade = sc1.nextInt();
        
        if (idade>=18)
        {
            System.out.println("Seu voto é obrigatorio !");
        }
        else if (idade>=16 && idade<18)
        {
            System.out.println("Seu voto é opicional !");
        }
        else if (idade<16)
        {
            System.out.println("Seu voto é proibido !");
        }
        sc1.close(); 
    }
}
