import java.util.Scanner;
public class Main6
{
	public static void main(String[] args) {
	 Scanner sc1 = new Scanner(System.in);
	
	   //6) Separar Pares e Ímpares (arrays)
	   
	   
	  int[] f = new int[6] ;
	  
	  System.out.println("Entre com 6 números: ");
	  for(int i =0;i < 6;i++)
	  {
	      f[i] = sc1.nextInt();
	  }
	  
	  System.out.println("Números pares do vetor: ");
	  
	  for (int i =0;i < 6;i++)
	  {
	      if (f[i]%2==0)
	      {
	          System.out.println(f[i]);
	      }
	  }
	  System.out.println("Números impares do vetor: ");
	   for (int i =0;i < 6;i++)
	  {
	      if (f[i]%2!=0)
	      {
	          System.out.println(f[i]);
	      }
	  }
	  
	  
	    
	    
	    
	   
	    
	   
	        }
	    }
	    


