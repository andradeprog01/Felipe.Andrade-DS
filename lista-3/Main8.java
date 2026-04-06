import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        // 8) Verificar senha (if) 
        
           int senha = 1234 ;
           int tent ;
        
        for (int i = 1 ; i<3 ; i++)
        {
            System.out.println("Entre com a senha: ");
            tent = sc1.nextInt();
            
            if (tent != senha)
            {
                System.out.printf("Senha Incorreta, tente novamente.");
            }
            else {
                System.out.printf("Senha correta!");
                System.exit(0);

            }
        }
        
        
        
        
    }
}