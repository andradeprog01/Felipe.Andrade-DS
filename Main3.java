import java.util.Scanner;
public class Main3
{
	public static void main(String[] args) {
	 Scanner sc1 = new Scanner(System.in);
	
	    //3) Sistema de Login com 3 Tentativas (while)
	    
	    int tentativa = 0;
	    
	    while (tentativa<3)
	    {
	        tentativa++;
	            System.out.println("Número de tentativas ["+tentativa+"]");
	            System.out.println("Entre com seu login: ");
	            String lo = sc1.next();
	            System.out.println("Entre com sua senha: ");
	            int senha = sc1.nextInt();
	
                if (lo.equals("Felipe") && senha==1234)
                {
                    System.out.println("Seja bem vindo! login efetuado com sucesso!");
                    break;
                }
                else if (tentativa==3)
                {
                    System.out.println("Voçê alcançou o maxímo de tentativas!");
                }
            
	        }
	    }
	    
	}

