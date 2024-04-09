import java.util.Scanner;

public class ExemploMatrizResolvido2 
{
	public static double[][] preencheNotas(int totalAlunos)
	{
		Scanner entrada = new Scanner(System.in);
		double[][] notasProvas = new double[10][3];

		
		System.out.println("Notas dos alunos");
		for (int aluno = 0; aluno < totalAlunos; aluno++)
		{
			System.out.printf("Aluno %d\n", aluno);
			System.out.println("   Notas das provas");
			for (int prova = 0; prova < 3; prova++)
			{
				System.out.printf("   Prova %d: ", prova);
				notasProvas[aluno][prova] = entrada.nextDouble();
			}
		}
		entrada.close();
		return(notasProvas);
	}
	
	public static void main(String[] args) 
	{
		double[][] notas = new double[10][3];
		int N = 4, numProva, quantProva0 = 0, quantProva1 = 0, quantProva2 = 0;
		
		// Preenchimento das notas
		notas = preencheNotas(N);
		
		// Cálculos
		for (int aluno = 0; aluno < N; aluno++)
		{
			// Processa menor nota de cada aluno
			numProva = provaComMenorNota(notas,aluno);
			System.out.printf("Aluno %d - Menor nota na prova %d\n", aluno, numProva);
			
			// Conta número de alunos com menor nota em cada prova
			switch (numProva)
			{
			     case 0: 
			    	 quantProva0++;
			    	 break;
			     case 1: 
			    	 quantProva1++;
			    	 break;
			     case 2:
			    	 quantProva2++;
			    	 break;
			}
		}
		
		// Imprime quantos alunos tiraram menor nota em cada prova
		imprimeQuantosPorProva (quantProva0, quantProva1, quantProva2);
		
	}
	
	public static int provaComMenorNota (double[][] valores, int numAluno)
	{
		double menor;
		int num;
		
		menor = valores[numAluno][0];
		num = 0;
		for (int prova = 1; prova < 3; prova++)
		{
			if (valores[numAluno][prova] < menor)
			{
				menor = valores[numAluno][prova];
				num =  prova;
			}
		}
		
		return (num);
	}
	public static void imprimeQuantosPorProva (int p0, int p1, int p2)
	{
		System.out.println("Prova 0 - " + p0);
		System.out.println("Prova 1 - " + p1);
		System.out.println("Prova 2 - " + p2);	
	}
}
