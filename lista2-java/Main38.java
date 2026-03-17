import java.util.Scanner;

public class Main38 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Digite a quantidade de segundos: ");
        int totalSegundos = sc1.nextInt();

        
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundosRestantes = totalSegundos % 60;

        System.out.printf("%d segundos equivalem a: %dh %dmin %ds%n", 
                          totalSegundos, horas, minutos, segundosRestantes);

        sc1.close();
    }
}

