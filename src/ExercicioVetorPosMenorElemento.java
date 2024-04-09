import java.util.Scanner;

public class ExercicioVetorPosMenorElemento {

	public static void main(String[] args) {
		
		//Declaração
		double [] vetor = new double [6];
		double menor;
		int posMenor = 0;
		Scanner entrada = new Scanner(System.in);
		
		//Preenchimento
		//for(int pos = 0; pos < vetor.length.pos++)
		//
		for(int pos = 0; pos <= 5; pos++)
		{
			
			System.out.printf("Digite o elemento da posição %d: ", pos);
			vetor[pos] = entrada.nextDouble();
			
		}
		
		//Inicializa menor de todos do conjunto como sendo o primeiro
		
		menor = vetor[0];
		
		//Compara valores a partir do segundo elemento
		
		for(int i = 1; i<=5; i++)
		{
			if(vetor[i] < menor)
			{
				menor = vetor[i];
				posMenor = i;
			}
		}
		
		//Exibe o menor elemento
		
		System.out.printf("O menor elemento é: %.2f\n" + " e esta na posição:  %d\n",menor, posMenor);

		entrada.close();
	}

}
