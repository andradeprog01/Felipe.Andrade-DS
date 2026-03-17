import java.util.Scanner;

public class ComparaStrings {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String s1 = sc1.next();
        System.out.print("Digite a segunda palavra: ");
        String s2 = sc1.next();
        System.out.print("Digite a terceira palavra: ");
        String s3 = sc1.next();

        
        if (s1.length() >= s2.length() && s1.length() >= s3.length())
        {
            System.out.println("A maior palavra é: " + s1);
        } 
        else if (s2.length() >= s1.length() && s2.length() >= s3.length())
        {
            System.out.println("A maior palavra é: " + s2);
        } 
        else
        {
            System.out.println("A maior palavra é: " + s3);
        }

        sc1.close();
    }
}
