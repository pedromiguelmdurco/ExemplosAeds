import java.util.Scanner;

public class Lista3Atv3 {
	
	public static int resto (int dividendo, int divisor)
	{
		if (dividendo < divisor)
		{
			return (dividendo);
		}
		else
		{
			return (resto(dividendo-divisor, divisor));
		}
	}
	public static int divisao (int dividendo, int divisor)
	{
		if (dividendo < divisor)
		{
			return (0);
		}
		else
		{
			return (1 + divisao (dividendo-divisor, divisor));
		}
	}
	
	public static void main(String[] args) {
		int a, b;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dividendo: ");
		a = entrada.nextInt();
		
		System.out.print("Digite o divisor: ");
		b = entrada.nextInt();
		
		System.out.printf("A divisão entre eles é %d\n", divisao(a,b));
		System.out.printf("O resto da divisão entre eles é %d\n",
				resto(a,b));
		
		entrada.close();
	}
}
