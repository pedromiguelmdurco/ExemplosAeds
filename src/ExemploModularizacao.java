import java.util.Scanner;

public class ExemploModularizacao {

	public static double somar() //procedimento
	{
		Scanner entrada = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = entrada.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		num2 = entrada.nextDouble();
		return(num1+num2);
		
		//entrada.close();//comentar quando for utilizar o codigo
	}

	public static void subtrair()
	{

		Scanner entrada = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = entrada.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		num2 = entrada.nextDouble();
		System.out.println("A subtra��o deles � "+(num1-num2));
		
		entrada.close();//comentar quando for utilizar
	}
	
	public static void multi()
	{
		Scanner entrada = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = entrada.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		num2 = entrada.nextDouble();
		System.out.println("A multiplica��o deles � "+(num1*num2));
		
		entrada.close();
	}

	public static void divi()
	{
		Scanner entrada = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = entrada.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		num2 = entrada.nextDouble();
		System.out.println("A divis�o deles � "+(num1/num2));
		
		entrada.close();
	}
	
	public static int menu()//funcao
	{
		Scanner entrada = new Scanner(System.in);
		int opcao;
		
		System.out.println("Calculadora da rosilage");
		System.out.println("Op��es para c�lculo");
		System.out.println("1-Somar");
		System.out.println("2-Subtrair");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		System.out.println("Op��o: ");	
		opcao = entrada.nextInt();
		
		return(opcao);
	}
	
	public static void main(String[] args) {
		
		//Variaveis
		Scanner entrada = new Scanner(System.in);
		int opcao;
		//double num1,num2;
		char resp;
		
		System.out.println("Deseja iniciar o programa (S - sim ou N - n�o):");
		resp = entrada.next().charAt(0);
		//Exibe menu de op�oes
		
		
		opcao = menu();
		
		while(resp == 'S'|| resp == 's')
		{
			switch(opcao)
			{
				case 1 : 
					System.out.println("A soma deles � "+somar());//acionamento do m�dulo somar
					break;
				
				case 2 : 
					subtrair();
					break;
				
				case 3 : 
					multi();
					break;
			
				
				case 4 : 
					divi();
					break;
					
				default:
					System.out.println("Digite umas das op��es");
			}	
		}
		
		
		System.out.println("deseja continuar o programa?: ");
		resp = entrada.next().charAt(0);
		
		
		entrada.close();
	}

}
