import java.util.Scanner;

public class ExercicioCondicional {

	public static void main(String[] args) {
		
		//Declaração de variaveis
		int a, b;
		Scanner entrada = new Scanner(System.in);
		// Leitura das variaveis
		System.out.print("Digite o primeiro valor: ");
		a = entrada.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = entrada.nextInt();
		
		//Comparar e Mostrar
		if(a < b)
		{
		
			System.out.println("O menor é "+a);
		}else if(a == b)
		{
			System.out.println("Os dois são iguais");
		}else 
		{
		System.out.println("O menor é "+b);
		}
		
		
		entrada.close();

	}

}
