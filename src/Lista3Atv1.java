import java.util.Scanner;

public class Lista3Atv1 {

	public static double serie (int N)
	{
		double parcela = 1;
		
		if (N < 1)
		{
			return (-1);
		}
		else if (N == 1)
		{
			return (1);
		}
		else 
		{
			for (int val = N; val > 1; val--)
			{
				parcela *= val;
			}
			return (1/parcela + serie(N-1));
		}
	}
	
	public static void main(String[] args) {
		int N;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de parcelas: ");
		N = entrada.nextInt();
		System.out.printf("O resultado de S é %.2f\n",
				serie(N));
		
		entrada.close();
	}

}
