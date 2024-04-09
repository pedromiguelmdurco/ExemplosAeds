import java.util.Scanner;

public class Exercicio2Lista {

	public static void processaPopulacao (int N)
	{
		double salario, somaSal = 0;
		int numFilhos, somaFilhos = 0;
		
		Scanner entradaPopulacao = new Scanner(System.in);
		
		for (int conta=1; conta <= N; conta++)
		{
			System.out.print("Qual é o salário? ");
			salario = entradaPopulacao.nextDouble();
			System.out.print("Quantos filhos? ");
			numFilhos = entradaPopulacao.nextInt();
			
			somaSal += salario; // somaSal = somaSal + salario;
			somaFilhos += numFilhos;  // somaFilhos = somaFilhos + numFilhos;
		}
		
		System.out.printf("A média do salário é %.2f\n",(somaSal/(somaFilhos+N)));
	}
	
	public static void main(String[] args) 
	{
		int populacao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Tamanho da população: ");
		populacao = entrada.nextInt();
		
		processaPopulacao(populacao);
				
		entrada.close();
	}

}