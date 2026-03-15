import java.util.Scanner; 

public class Main7 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com a temperatura (celscius): ");
        double cels = sc1.nextInt();
        
        double faren = (cels*1.8)+32;
        
        System.out.println("Sua temperatura convetida para Fahrenheit é de ["+faren+"]");
        
        
        
        sc1.close(); 
    }
}
