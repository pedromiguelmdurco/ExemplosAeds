import java.util.Scanner;

public class ExercicioCondicional {

	public static void main(String[] args) {
		
		//Declara��o de variaveis
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
		
			System.out.println("O menor � "+a);
		}else if(a == b)
		{
			System.out.println("Os dois s�o iguais");
		}else 
		{
		System.out.println("O menor � "+b);
		}
		
		
		entrada.close();

	}

}
