import java.util.Scanner;

public class ExercicioModularizaoSomatorio {

	public static double fatorial (int num)
	{
		double resultado = 1;
		
		
		if(num >= 0)
		{
			for(int i=num; i>1 ; i--)
			{
				resultado = resultado * i;
			}	
			return(resultado);
		}
		else
		{
			System.out.print("Erro");
			return(-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int N, sinal = 1;
		double S = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de N: ");
		N = entrada.nextInt();
		
		for(int valor = 1; valor  <= N; valor++) 
		{
			S = S + sinal*(1/fatorial(valor));
			sinal = sinal *(-1);
			
		}
		
		System.out.printf("O resultado do Fatorial de %d"
				+ " é %.2f\n ", N , S);
		
		entrada.close();
	}

}
