import java.util.Scanner;

public class Main13 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
// 		13) Somar pares e ímpares (for)
		
		
		int somaPares = 0;
        int somaImpares = 0;
        
        System.out.print("Até qual número você deseja somar? ");
        int limite = sc1.nextInt();
        
        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                somaPares += i; 
            } else {
                somaImpares += i; 
            }
        }
        
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
		
		
		
		
		




	}
}