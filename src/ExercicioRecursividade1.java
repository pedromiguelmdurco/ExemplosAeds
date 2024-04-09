import java.util.Scanner;

public class ExercicioRecursividade1 {

	public static int somatorio (int N)
	{
		if(N < 1)
		{
			return 0 ;
		}
		else if(N == 1)
		{
			return 1;
		}
		else
		{
			return(somatorio(N-1)+N);
		}
		
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num, resultado;
		
		System.out.print("Digite o número: ");
		num = entrada.nextInt();
		
		resultado = somatorio(num);
		
		System.out.println("O total é "+ resultado);
		System.out.println("O total é "+ somatorio(num));
		
		entrada.close();
		
	}

}
