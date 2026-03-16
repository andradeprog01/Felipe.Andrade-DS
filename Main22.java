import java.util.Scanner;
public class Main22
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade em horas: ");
		double h = sc1.nextDouble();
		double m = (h*60);
		System.out.println(h+" horas em minutos são ["+m+"]");
	}
}
