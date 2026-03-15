import java.util.Scanner; 

public class Main2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro numero: ");
        int num1 = sc1.nextInt();
        
        System.out.println("Entre com o segundo numero: ");
        int num2 = sc1.nextInt();
        
        if (num1 > num2) {
            System.out.println("O primeiro numero [" + num1 + "] é maior que o segundo [" + num2 + "]");
        } 
        else if (num1 < num2) {
            System.out.println("O segundo numero [" + num2 + "] é maior que o primeiro [" + num1 + "]");
        } 
        else {
            System.out.println("Os dois numeros possuem o mesmo valor!");
        }
        
        sc1.close(); 
    }
}
