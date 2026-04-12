import java.util.Scanner;
public class Main4
{
	public static void main(String[] args) {
	 Scanner sc1 = new Scanner(System.in);
	
	    //4) Caixa Eletrônico com cálculo de notas
	    int soma=0;
	    int i = 0 ;
	    int[] nall = new int[3];
	    while(i<3)
	    {
	        System.out.println("Entre com o valor da nota ["+i+"]: ");
	        nall[i] = sc1.nextInt();
	        i++;
	    }
	    for (int j =0;j<3;j++)
	    {
	        soma = soma + nall[j];
	        
	    }
	        System.out.println("O valor diario do caixa eletronico é de: "+soma);
	   
	    
	   
	        }
	    }
	    


