import java.util.Scanner;

public class ExemploString {

	public static void verificarSenha ()
	{
		Scanner entrada = new Scanner(System.in);
		String senhaDigitada;
		
		System.out.print("Digite sua senha: ");
		senhaDigitada = entrada.nextLine();
		
		if (senhaDigitada.equals("1234"))
		{
			System.out.println("Acesso liberado");
		}
		else
		{
			System.out.println("Senha incorreta");
		}
	}
	public static void main(String[] args) {
		String texto, texto2;
		Scanner entrada = new Scanner(System.in);
		StringBuilder frase;
		String[] palavras = new String[5];
		int idade = 5, posEncontrada = -1;
		double valor = 10.9;
		valor = idade;
		idade = (int)valor;
		
		
		verificarSenha();
		
		for (int i=0; i < palavras.length; i++)
		{
			System.out.print("Digite uma palavra: ");
			palavras[i] = entrada.next();
		}
		
		System.out.println("Digite uma palavra a ser procurada na frase: ");
		texto2 = entrada.next();
		
		for (int i=0; i < texto2.length(); i++) 
			// length() - total de caracteres da String
		{
			System.out.println(texto2.charAt(i));
		}
				
		for (int pos=0; pos < palavras.length; pos++)
		{
			if (texto2.equals(palavras[pos]))
			{
				System.out.println("Encontrou");
				posEncontrada = pos;
			}
			
			/*
			if (palavras[pos].equals(texto2))
			{
				System.out.println("Encontrou palavra de novo");
			}
			*/
		}
		
		if (posEncontrada != -1)
		{
			System.out.println("Palavra encontrada na posição " + posEncontrada);
		}
		else
		{
			System.out.println("Palavra não encontrada");
		}

		
		entrada.close();
	}

}
