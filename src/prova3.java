import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class prova3 {

	public static void main(String[] args) 
	{
		Pessoa[] turma = new Pessoa[60];
		Scanner teclado = new Scanner(System.in), arquivo;
		String nomeEntrada, nomeSaida;
		File arq;
		int conta = 0;
		
		System.out.println("Digite o nome completo do arquivo de entrada:");
		nomeEntrada = teclado.nextLine();
		
		try
		{
			arq = new File(nomeEntrada);
			
			arquivo = new Scanner(arq);
				
			System.out.println("Digite o nome completo do arquivo de saída:");
			nomeSaida = teclado.nextLine();
				
			while (arquivo.hasNextLine() && conta < turma.length)
			{
				// ???? (1 ponto)
				turma[conta].lerArquivo(arquivo);
				// ???? (0,5 ponto)
			}
		
			for (int i=0; i < conta; i++)
			{
				turma[i].salvarArquivo(nomeSaida);
			}
			
			
			arquivo.close();
		}
		catch (IOException ioex)
		{
			System.out.println("Erro - arquivo de entrada inexistente");
		}
		teclado.close();
		
	}

}
class Pessoa
{
	private String nome;
	private int idade;
	private double altura;
	private double[][] notas;
	
	
	public Pessoa ()
	{
		inicializar("qualquer", 1, 1, new double[2][2]);
	}
	
	public Pessoa (String novoNome, int novaIdade, double novaAltura, double[][] novasNotas)
	{
		inicializar(novoNome, novaIdade, novaAltura, novasNotas);
	}
	
	private void inicializar (String novoNome, int novaIdade, double novaAltura, double[][] novasNotas)
	{
		setNome(novoNome);
		setIdade(novaIdade);
		setAltura(novaAltura);
		setNotas(novasNotas);
	}
	
	public void setNome (String texto) 
	{
		if (texto != null)
		{
			nome = texto;
		}		
	}
	public void setIdade (int valor)
	{
		if (valor > 0)
		{
			idade = valor;
		}		
	}
	
	public void setAltura(double altura)
	{
		if (altura > 0)
		{
			this.altura = altura;
		}		
	}
	
	public void setNotas(double[][] matriz)
	{
		if (matriz != null)
		{
			notas = matriz;
		}
		else
		{
			System.out.println("Matriz de notas não foi criada");
		}
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public int getIdade()
	{
		return idade;
	}
	
	public double getAltura()
	{
		return altura;
	}
	
	public double[][] getNotas()
	{
		return notas;
	}
	
	public void exibir ()
	{		
		System.out.printf("Nome %s, idade %d anos, altura %.2fm\n",
				getNome(), getIdade(), getAltura());
		System.out.println("Notas:");
		for (int ln = 0; ln < notas.length; ln++)
		{
			for (int col=0; col < notas[0].length; col++)
			{
				System.out.printf("%.2f ", notas[ln][col]);
			}
			System.out.println();
		}
	}
	
	public void lerArquivo (Scanner entrada)
	{
		
		Scanner ler = entrada;
		
	}
	
	public void salvarArquivo (String path)
	{	
		try {
		FileWriter saida1 = new FileWriter(path);
		
		FileWriter saida = (saida1);
		
		saida.close();
		}catch(IOException ioex){
			System.out.println("Não existe arquivo");
		}
		
	}
}
