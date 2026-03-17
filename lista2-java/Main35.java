import java.util.Scanner;

public class Main35 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Entre com o valor do produto: ");
        double pro = sc1.nextDouble();
        
        if (pro<=50)
        {
            pro = pro - (pro*0.05);
            System.out.println("O valor com descontos é de: ["+pro+"]");
        }
        else if (pro>50 && pro<100)
        {
            pro = pro - (pro*0.10);
        }
        else if (pro>100)
        {
            pro = pro - (pro*0.15);
            System.out.println();
        }
        sc1.close();
    }
}
