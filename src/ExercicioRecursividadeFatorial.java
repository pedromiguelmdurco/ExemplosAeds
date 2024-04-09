import java.util.Scanner;

public class ExercicioRecursividadeFatorial {
	
	public static double fatorial(int base)
	{
		if(base == 0 || base == 1)
		{
			return 1 ;
		}
		else 
		{
			return (base* fatorial(base-1));
		}
			
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite o valor de N: ");
		N = entrada.nextInt();
		
		System.out.printf("O valor do fatorial de  %.0f\n", fatorial(N));
		
		
		entrada.close();

	}

}
