import java.util.Scanner;

public class ExercicioRecursividade3 {

	
	public static void desenha (int altura)
	{
		
		if(altura < 1)
		{
			System.out.println("Altura invalida");
		}
		
		else if(altura == 1)
		{
			System.out.println("*");
		}
		
		else
		{
			desenha(altura-1);
			for (int conta =1; conta <=altura; conta++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int N;
		
		System.out.print("Qual a altura da arvore: ");
		N = entrada.nextInt();
		
		desenha(N);
		
		entrada.close();

	}

}
