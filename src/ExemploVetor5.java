import java.util.Scanner;

public class ExemploVetor5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] alturas = new double[50];
		int[] codigos = new int[50];
		double maior, menor, somaFem = 0, mediaFem, soma = 0, media;
		int n = 5, contaFem = 0;
		
		for(int i=0;i < 5; i++)
		{
		
			System.out.println("Altura: ");
			alturas[i] = entrada.nextDouble();
			
			System.out.println("Sexo(' - Masculino, 2 - Feminino:  ");
			codigos[i] = entrada.nextInt();
			
		}
		maior = Double.MIN_VALUE;
		menor = Double.MAX_VALUE;
		
		for(int pos = 0; pos < 5; pos++)
		{
			if(alturas[pos]<menor)
			{
				menor = alturas[pos];
			}
			if(alturas[pos] > maior)
			{
				maior = alturas[pos];
			}
			
		}
		
		System.out.printf("A menor altura é %.2f e a maior %.2f\n", menor, maior);
		
		/*
		maior = alturas[0];
		menor = alturas[0];
		
		for(int pos = 1; pos < 5; pos++)
		{
			if(alturas[pos]<menor)
			{
				menor = alturas[pos];
			}
			if(alturas[pos] > maior)
			{
				maior = alturas[pos];
			}
			
		}
		
		System.out.printf("A menor altura é %.2f e a maior %.2f\n", menor, maior);
		*/
		
		for (int prox = 0; prox < n ; prox++)
		{
			
			if(codigos[prox] == 2)
			{
				somaFem+= alturas[prox];
				contaFem++;
			}
			
		}
		mediaFem = somaFem/contaFem;
		
		System.out.printf("A media das alturas das mulheres é %.2f\n", mediaFem);
		entrada.close();
		
		System.out.println("Alturas das mulheres acima da media das mulheres: ");
		for(int pos = 0; pos < n; pos++)
		{
			
			if(codigos[pos] == 2 && alturas[pos] >  mediaFem)
			{
				
				System.out.printf("%.2f ",alturas[pos]);
				
			}
				
		}
		System.out.println();
		
		for (int prox = 0; prox < n ; prox++)
		{
				
			soma = alturas[prox];
			
		}
		
		media = soma/n;
		
		System.out.printf("A media das alturas das é %.2f\n", media);
		entrada.close();
		
		System.out.println("Alturas acima da media: ");
		for(int pos = 0; pos < n; pos++)
		{
			
			if(codigos[pos] == 2 && alturas[pos] >  media)
			{
				
				System.out.printf("%.2f ",alturas[pos]);
				
			}
				
		}
		System.out.println();
		
	}

}
