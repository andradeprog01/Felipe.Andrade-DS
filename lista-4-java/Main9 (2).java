import java.util.Scanner;
public class Main9
{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		//9) Cadastro de Alunos com mC)todos

		System.out.println("---CADASTRO DE ALUNOS---");
		System.out.println("Quantos alunos vocC* deseja cadastrar: ");
		int q_alunos = sc1.nextInt();

		String[] alunos = new String [q_alunos];
		int[] id = new int[q_alunos];


		for (int i=0; i < q_alunos; i++)
		{
			System.out.println("Entre com o nome do aluno "+ (i+1) +":");
			alunos[i] = sc1.next();

			System.out.println("Entre com o id do aluno "+ (i+1) +":");
			id[i] = sc1.nextInt();

		}
		System.out.println("---LISTA FINAL---");
		for (int j=0 ; j<q_alunos; j++)
		{
			System.out.println("ALUNO: "+alunos[j]+" ID: "+id[j]);
		}








	}
}
