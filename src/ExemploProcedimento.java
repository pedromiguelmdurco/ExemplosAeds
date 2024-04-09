
public class ExemploProcedimento {

	public static void menu()
	{
		System.out.println("Exemplo de procedimento");
		System.out.println("Desenha árvore");
		System.out.println("Com a altura indicada");
	}//o java permite que voce bote o  public static void depois do main mas algumas linguagens n deixa
	
	
	public static void arvore()
	{
		// Para cada tamanho de árvore
		for (int tam = 1; tam <= 5; tam++)
		{
			System.out.println("\nÁrvore com tamanho " + tam);
			// Para cada linha
			for (int ln = 1; ln <= tam; ln++)
			{				
				// Exibe árvore esquerda
				
				for (int conta=1; conta <= tam-ln; conta++)
				{
					System.out.print(' ');
				}				
				
				// Quantos asteriscos na árvore à direita
				for (int quant = 1; quant <= 2*ln; quant++)
				{
					System.out.print('*');
				}
				System.out.println();
			}

		}
	}
	public static void main(String[] args) {
		
		// Declaração de variáveis
	
		// Exibição de menu
		
		menu();
		//Desenha a árvore
		arvore();
		


	}

}
