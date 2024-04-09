import java.util.Scanner;

public class ExercicioRecursividade2 {

	
	public static int digito(int num)
	{
		if(num<0)
		{
			return -1;
		}
		else if(num < 10)
		{
			return 1;
		}
		else
		{
			return(1 + digito(num/10));
		}
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int val, quant;
		
		System.out.println("Digite um valor: ");
		val = entrada.nextInt();
		
		
		quant = digito(val);
		
		System.out.println("A quantidade de digitos é "+ quant);
		System.out.println("A quantidade de digitos é "+ digito(val));
		
		entrada.close();

	}

}
