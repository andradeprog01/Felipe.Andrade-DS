import java.util.Scanner; 

public class Main5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com seu salario: ");
        double salario = sc1.nextInt();
        
        if (salario<2000)
        {
            salario = salario + (salario*0.10);
            System.out.println("Seu salario ajustado é de: ["+salario+"]");
        }
        else if (salario>2000 && salario<4000)
        {
            salario = salario + (salario*0.07);
            System.out.println("Seu salario ajustado é de: ["+salario+"]");
        }
        else if (salario>4000)
        {
            salario = salario+(salario*0.05);
            System.out.println("Seu salario ajustado é de: ["+salario+"]");
        }
      
        
        sc1.close(); 
    }
}
