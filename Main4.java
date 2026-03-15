import java.util.Scanner; 

public class Main4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Entre com a primeira nota: ");
        int nota1 = sc1.nextInt();
        System.out.println("Entre com a segunda nota: ");
        int nota2 = sc1.nextInt();
        System.out.println("Entre com a terceira nota: ");
        int nota3 = sc1.nextInt();
        
        int media = (nota1+nota2+nota3)/3;
        
        if (media>=7)
        {
            System.out.println("Sua média é ["+media+"] e você está aprovado !");
        }
        else if (media>5 && media<7) 
        {
            System.out.println("Sua média é ["+media+"] e você está de recuperação !");
        }
        else
        {
            System.out.println("Sua média é ["+media+"] e você está reprovado !");
        }
        
        sc1.close(); 
    }
}
