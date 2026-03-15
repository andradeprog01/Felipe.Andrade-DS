import java.util.Scanner; 

public class Main12 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número: ");
        int num1 = sc1.nextInt();
        System.out.println("Entre com o segundo número: ");
        int num2 = sc1.nextInt();
        System.out.println("Escolha o sinal (*) (+) (-) (/): ");
        String sinal = sc1.next();
        
        if (sinal.equals("*"))
        {
            int mult = num1*num2;
            System.out.println("A multiplicação do primeiro e do segundo número resulta em, ["+mult+"]");
        }
        else if (sinal.equals("+"))
        {
            int soma = num1 + num2;
            System.out.println("A soma do primeiro e do segundo número resulta em, ["+soma+"]");
        }
        else if (sinal.equals("-"))
        {
            int sub = num1-num2;
            System.out.println("A subtração do primeiro pelo segundo número resulta em, ["+sub+"]");
        }
        else if (sinal.equals("/"))
        {
            int div = num1/num2;
            System.out.println("A divisão do primeiro pelo segundo número resulta em, ["+div+"]");
            
        }
        
        
       
        
        
        sc1.close(); 
    }
}
