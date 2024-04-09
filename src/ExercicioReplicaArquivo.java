import java.io.*;
import java.util.Scanner;

public class ExercicioReplicaArquivo {

	public static void main(String[] args) {
		try
		{
			File arqAlunosEnt = new File("C:\\Users\\envio\\Desktop\\Aulas puc\\AEd\\alunos.txt");
			Scanner entradaAlunos = new Scanner (arqAlunosEnt);
			FileWriter saida = new FileWriter("C:\\Users\\envio\\Desktop\\Aulas puc\\AEd\\alunos.txt");
			String linha;
			
			while (entradaAlunos.hasNextLine()) 
			{
				linha = entradaAlunos.nextLine();
				saida.write(linha + "\n");
			}
			
			saida.close();
			entradaAlunos.close();
		}
		catch(IOException ioex)
		{
			System.out.println("Não existe arquivo");
		}
		
		System.out.println("Terminou o programa");
	}

}
