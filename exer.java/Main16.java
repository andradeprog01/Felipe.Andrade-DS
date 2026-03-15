import java.util.Scanner; 

public class Main16 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com seu usuario: ");
        String user = sc1.next();
        
        if (user.equals("admin"))
        {
            System.out.println("usuario encontrado!");
        }
        else
        {
            System.out.println("Usuario não encontrado! ");
            System.exit(0);
        }
        
        System.out.println("Entre com sua senha: ");
        int senha = sc1.nextInt();
        
        if (senha == 1234)
        {
            System.out.println("Login concluido !");
        }
        else 
        {
            System.out.println("Senha incorreta!");
        }
        
        
        
        
        
        
        
        sc1.close(); 
    }
}
