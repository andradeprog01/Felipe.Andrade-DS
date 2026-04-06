import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        int tentativa = 0;
        String login = "felipe";
        int senha = 1234;
        
        
        while (tentativa < 3) {
            System.out.println("\nTentativa " + (tentativa + 1) + " de 3");
            System.out.print("Entre com seu login:(nome usuario) ");
            String login2 = sc1.next();
            System.out.print("Entre com sua senha:(numeros) ");
            int senha2 = sc1.nextInt();
            
            
            if (login.equals(login2) && senha == senha2) {
                System.out.println("Seja bem vindo!!");
                break; 
            } else {
                tentativa++; 
                System.out.println("Usuário ou senha incorretos!");
                
                if (tentativa == 3) {
                    System.out.println("Acesso bloqueado!");
                }
            }
        }
        sc1.close();
    }
}
