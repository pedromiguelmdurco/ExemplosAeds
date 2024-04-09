
public class ExemploProcedimento {

	public static void menu()
	{
		System.out.println("Exemplo de procedimento");
		System.out.println("Desenha �rvore");
		System.out.println("Com a altura indicada");
	}//o java permite que voce bote o  public static void depois do main mas algumas linguagens n deixa
	
	
	public static void arvore()
	{
		// Para cada tamanho de �rvore
		for (int tam = 1; tam <= 5; tam++)
		{
			System.out.println("\n�rvore com tamanho " + tam);
			// Para cada linha
			for (int ln = 1; ln <= tam; ln++)
			{				
				// Exibe �rvore esquerda
				
				for (int conta=1; conta <= tam-ln; conta++)
				{
					System.out.print(' ');
				}				
				
				// Quantos asteriscos na �rvore � direita
				for (int quant = 1; quant <= 2*ln; quant++)
				{
					System.out.print('*');
				}
				System.out.println();
			}

		}
	}
	public static void main(String[] args) {
		
		// Declara��o de vari�veis
	
		// Exibi��o de menu
		
		menu();
		//Desenha a �rvore
		arvore();
		


	}

}
