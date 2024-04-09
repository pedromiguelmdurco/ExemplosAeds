import java.util.Scanner;

public class ExerCond {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a, b, opcao;
		double resultado = 0;
		char sair = 'n';// n - Não Sair
				
	while (sair == 'n'|| sair == 'N') 
	{
		
		//Leitura dos números e da opçao
		System.out.print("Digite dois números: ");
		a = entrada.nextInt();
		b = entrada.nextInt();
		
		System.out.println("Escolha uma opçao");
		System.out.println("1 - Media");
		System.out.println("2 Diferença do maior pelo menor");
		System.out.println("3 - Produto");
		System.out.println("4 - Divisão do primeiro pelo o segundo");
		System.out.print("Opção:");
		
		opcao = entrada.nextInt();
		
		//Calculo correspondente à opçao
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
					System.out.println("Não existe divisão por zero");
				}
			break;
			
			default: System.out.println("Opção invalida");
			break;
		}
	
		
		//Mostrar resultado do calculo
		if(opcao >= 1 && opcao <= 4)
		{
			System.out.printf("O resultado é %.2f\n",resultado);
		}else
		{
			System.out.print("Digite uma opção de 1 a 4");
		}
		
		System.out.println("Quer sair do programa (s-Sim ou n-Não)?");
		sair = entrada.next().charAt(0);
	}//while
		
		
		
		entrada.close();

	}

}
