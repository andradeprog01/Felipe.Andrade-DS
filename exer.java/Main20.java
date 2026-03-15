import java.util.Scanner; 

public class Main20 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.print("Lado A: ");
        double a = sc1.nextDouble();
        System.out.print("Lado B: ");
        double b = sc1.nextDouble();
        System.out.print("Lado C: ");
        double c = sc1.nextDouble();

        
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Não forma triângulo");
        }
        

        
   
        
        
        
        
        sc1.close(); 
    }
}
