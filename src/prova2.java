import java.util.Scanner;

public class prova2 {

		
		public static double conta(int num)
		{
			
			double conta, total = 0;
			
			for(double t = 1; t <= num; t++)
			{
				
				conta =(t*t+1)/(t+3);
				total += conta;
				System.out.printf("Resultado:  %.2f\n", conta);
				
			}
			
			
			return (total);
			
		}
	
		public static int ex4(int num, int pot)
		{
			
			int total = 1;
			
			for(int cont = pot; cont > 0; cont--)
			{
				
				total *= num;
				
			}
			
			return total;
		}
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
		
			int n;
			
			System.out.println("Digite um valor: ");
			n = entrada.nextInt();
			

			System.out.printf(" %.2f\n",conta(n));
			
			
			/*int x, y;
			
			System.out.print("Digite um valor: ");
			x = entrada.nextInt();
			System.out.print("Digite a pontencia: ");
			y = entrada.nextInt();
			
			System.out.print("O resultando é "+ ex4(x,y));
			*/
			
			entrada.close();

		}


}
