import java.util.Scanner; 

public class Main14 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com a distância da viagem: ");
        double dis = sc1.nextDouble();
        System.out.println("Entre com o consumo do carro (km/l)");
        double cons = sc1.nextDouble();
        
        double lit = dis/cons;
        
        System.out.println("Para concluir sua viagem serão necessarios ["+lit+"] litros de gasolina ");
        
        
        sc1.close(); 
    }
}
