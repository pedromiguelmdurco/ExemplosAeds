import java.util.Scanner;

public class ExemplosTexto {


	public static void main(String[] args) {
		String texto = "Uma frase qualquer";
		String frase = "Uma frase qualquer";
		String texto2 = new String("Uma frase qualquer");
		String frase2 = new String("Uma frase qualquer");
		String texto3;
		Scanner entrada = new Scanner (System.in);
		StringBuilder textoEditavel = new StringBuilder("Uma frase qualquer");

		String[] palavras = { "Essa", "é", "uma", "frase"};
		//int[] vetor = { 1, 2, 3, 4};
		
		String[] palavras2 = new String[4];
		palavras2[0] = "Essa";
		palavras2[1] = "é";
		palavras2[2] = "uma";
		palavras2[3] = "frase";
		
		String fraseCompleta = String.join("*", palavras2);
		
		System.out.println(fraseCompleta);
		System.out.println(palavras);

		
		//String texto4 = texto + frase;
		String texto4 = texto.concat(frase);
		
		texto = texto + " outra coisa";
		texto += " no final";
		System.out.println(texto);
		
		System.out.println(texto4);
		
		System.out.println(texto.charAt(4));
		
		textoEditavel.append(" a mais");
		System.out.println(textoEditavel);
		
		System.out.println("Digite uma frase: ");
		texto3 = entrada.nextLine();
		System.out.println(texto3);
		
		System.out.println("Dois literais criados com os aspas");
		if (texto == frase)
		{
			System.out.println("== Os dois estão na mesma posição");
		}
		else
		{
			System.out.println("== Os dois não estão na mesma posição");
		}
		if (texto.equals(frase))
		{
			System.out.println("equals - O conteúdo é o mesmo");
		}
		else
		{
			System.out.println("equals - O conteúdo é diferente");
		}
		System.out.println();
		
		System.out.println("Compara um literal com um geral");
		if (texto == texto2)
		{
			System.out.println("== Na mesma posição de novo");
		}
		else
		{
			System.out.println("== Com certeza em posições diferentes");
		}
		if (texto.equals(texto2))
		{
			System.out.println("equals - Mesmo conteúdo");
		}
		else
		{
			System.out.println("equals - Conteúdos diferentes");
		}
		System.out.println();
		
		System.out.println("Dois gerais");
		if (frase2 == texto2)
		{
			System.out.println("== Na mesma posição de NOVO");
		}
		else
		{
			System.out.println("== Com certeza em posições DIFERENTES");
		}
		if (frase2.equals(texto2))
		{
			System.out.println("equals - MESMO CONTEÚDO");
		}
		else
		{
			System.out.println("equals - CONTEÙDO DIFERENTE");
		}
		
		entrada.close();
	}
	
}
