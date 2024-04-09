import java.util.Scanner;

public class ExerCond {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a, b, opcao;
		double resultado = 0;
		char sair = 'n';// n - N�o Sair
				
	while (sair == 'n'|| sair == 'N') 
	{
		
		//Leitura dos n�meros e da op�ao
		System.out.print("Digite dois n�meros: ");
		a = entrada.nextInt();
		b = entrada.nextInt();
		
		System.out.println("Escolha uma op�ao");
		System.out.println("1 - Media");
		System.out.println("2 Diferen�a do maior pelo menor");
		System.out.println("3 - Produto");
		System.out.println("4 - Divis�o do primeiro pelo o segundo");
		System.out.print("Op��o:");
		
		opcao = entrada.nextInt();
		
		//Calculo correspondente � op�ao
		switch(opcao)
		{
			case 1: resultado = (a+b)/2.0;
			break;
		
			case 2: 
				if(a > b)
				{
					resultado = a - b;
				}else 
				{
					resultado = b - a;
				}
			break;
				
			case 3: resultado = a*b;
			break;
			
			case 4: 
				if(b != 0)
				{
					resultado = (double)a/b;
				}else
				{
					resultado = 0;
					System.out.println("N�o existe divis�o por zero");
				}
			break;
			
			default: System.out.println("Op��o invalida");
			break;
		}
	
		
		//Mostrar resultado do calculo
		if(opcao >= 1 && opcao <= 4)
		{
			System.out.printf("O resultado � %.2f\n",resultado);
		}else
		{
			System.out.print("Digite uma op��o de 1 a 4");
		}
		
		System.out.println("Quer sair do programa (s-Sim ou n-N�o)?");
		sair = entrada.next().charAt(0);
	}//while
		
		
		
		entrada.close();

	}

}
