import java.util.Scanner; 

public class Main10 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        
        System.out.println("Entre com sua altura: ");
        double alt = sc1.nextDouble();
        System.out.println("Entre com seu sexo (M ou F)");
        String sexo = sc1.next();
        
        if (sexo.equalsIgnoreCase("M"))
        {
            double peso_ideal_masc = (72.7 * alt) - 58;
            System.out.println("Seu peso ideal é de ["+peso_ideal_masc+"]");
        }
        else if (sexo.equalsIgnoreCase("F")) 
        {
            double peso_ideal_fem = (62.1 * alt) - 44.7;
            System.out.println("Seu peso ideal é de ["+peso_ideal_fem+"]");
        }
        
        
        sc1.close(); 
    }
}
