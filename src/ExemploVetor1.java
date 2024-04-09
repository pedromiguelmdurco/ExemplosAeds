import java.util.Scanner;

public class ExemploVetor1 {

	public static void main(String[] args) {
		
		//Declaração
		
		int[] valores = new int[6];
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		
		//Preenchimento
		
		for(int indice = 0; indice <= 5; indice++)
		{
			System.out.printf("Digite valor do índice %d: ", indice);
			valores[indice] = entrada.nextInt();
		}
		
		// Exibição ddo conteúdo]
		
		for(int pos=0; pos < valores.length; pos++)
		{
			System.out.print(valores[pos]+ " ");
		}
		
		// Soma dos elementos
		System.out.println();
		
		for(int pos=0; pos < valores.length; pos++)
		{
			soma = soma + valores[pos];
		}
		System.out.printf("A soma dos valores é %d\n", soma);
		
		entrada.close();
	}

}
