import java.util.Scanner;

public class Main31 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int num1 = sc1.nextInt();
        System.out.println("Entre com o segundo número: ");
        int num2 = sc1.nextInt();
        System.out.println("Entre com o terceiro número: ");
        int num3 = sc1.nextInt();
        
        if (num1>num2 && num1>num3 && num2>num3)
        {
            System.out.println(num1+" "+num2+" "+num3);
        }
        else if (num1>num2 && num1>num3 && num2<num3) 
        {
            System.out.println(num1+" "+num3+" "+num2);
        }
        else if (num2>num1 && num2>num3 && num1>num3) 
        {
            System.out.println(num2+" "+num1+" "+num3);
        }
        else if (num2>num1 && num2>num3 && num1<num3) 
        {
            System.out.println(num2+" "+num3+" "+num1);
        }
        else if (num3>num1 && num3>num2 && num2>num1) 
        {
            System.out.println(num3+" "+num2+" "+num1);
        }
        else if (num3>num1 && num3>num2 && num2<num1) 
        {
            System.out.println(num3+" "+num1+" "+num2);
        }
        
        sc1.close();
    }
}
