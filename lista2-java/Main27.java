import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com a distância da viagem (KM): ");
        double km = sc1.nextDouble();
        System.out.println("Entre com a velocidade média do veiculo: ");
        double vel = sc1.nextDouble();
        
        double tempo = km/vel;
        
        System.out.println("O tempo estimado da viajem é de ["+tempo+"] horas !");
        
        sc1.close();
    }
}
