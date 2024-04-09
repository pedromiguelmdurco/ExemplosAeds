
public class ExemploTabuada {

	public static void tabuada() 
	{
		//Declaraçao de variaveis
		//int N = 8;
		for(int N=1; N <= 5;N++)
		{
			for(int num = 0; num <= 10; num++)
			{
				System.out.printf(" %d x %d = %d\n",N,num,(N*num));
			}
			System.out.println();
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		tabuada();

	}

}
