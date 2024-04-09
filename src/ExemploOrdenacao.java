import java.util.Scanner;

public class ExemploOrdenacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int x, y, z;
		
		System.out.print("Digite 3 números: ");
		x = entrada.nextInt();
		y = entrada.nextInt();
		z = entrada.nextInt();
		
		if(x >= y && x >= z)
		{
			if(y >= z)
			{
				System.out.println(z + "" + y + "" + x);
			}
			else 
			{
				System.out.println(y + "" + z + "" + x);
			}
			
		}
		else if (y>= x && y >= z)
		{
			if(x >= z)
			{
				System.out.println(z + "" + x + "" + y);
			}
			else 
			{
				System.out.println(x + "" + z + "" + y);
			}
			
		}
		else
		{
			if(x >= z)
			{
				System.out.println(y + "" + x + "" + z);
			}
			else 
			{
				System.out.println(x + "" + y + "" + z);
			}
			
		}
		
		
		switch(x)
		{
		case 1: System.out.println("Um");break;
		case 2: System.out.println("Dois");break;
		case 3: System.out.println("Três");break;
		
		default: System.out.println("Não é 1,2 ou 3");break;
		}
		
		
		entrada.close();

	}

}
