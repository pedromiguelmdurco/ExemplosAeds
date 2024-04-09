import java.util.Scanner;

public class GeralClasses 
{
	
	public static void main(String[] args) 
	{
		Estudante clarissa = new Estudante(), 
				gabriel = new Estudante(), 
				igor = new Estudante(), 
				luan = new Estudante();
		Disciplina[] notasDisciplinas = new Disciplina[3];
		Scanner entrada = new Scanner(System.in);
		
		clarissa.mudaNome("Clarissa Nascimento");
		clarissa.alteraIdade(18);
		System.out.println("Nome " + clarissa.obtemNome());
		for (int disc = 0; disc < notasDisciplinas.length; disc++)
		{
			notasDisciplinas[disc] = new Disciplina();
			System.out.print("Nome da disciplina: ");
			notasDisciplinas[disc].mudaNome(entrada.nextLine());
			System.out.print("Nota: ");
			notasDisciplinas[disc].alteraNota(entrada.nextDouble());
			entrada.nextLine();
		}
		clarissa.preencheNotas(notasDisciplinas);
		clarissa.exibirDados();
		
		System.out.println("\nPróximo estudante");
		System.out.print("Digite o nome do aluno: ");
		gabriel.mudaNome(entrada.nextLine());
		System.out.print("Qual é a idade? ");
		gabriel.alteraIdade(entrada.nextInt());
		System.out.println("Quais são as notas das disciplinas?");
		for (int disc = 0; disc < notasDisciplinas.length; disc++)
		{
			notasDisciplinas[disc] = new Disciplina();
			System.out.print("Nome da disciplina: ");
			notasDisciplinas[disc].mudaNome(entrada.nextLine());
			System.out.print("Nota: ");
			notasDisciplinas[disc].alteraNota(entrada.nextDouble());
			entrada.nextLine();
		}
		gabriel.preencheNotas(notasDisciplinas);
		gabriel.exibirDados();
		
		System.out.println("\nPróximo aluno");
		igor.mudaNome("Igor Castro");
		igor.alteraIdade(18);
		for (int disc = 0; disc < notasDisciplinas.length; disc++)
		{
			notasDisciplinas[disc] = new Disciplina();
			System.out.print("Nome da disciplina: ");
			notasDisciplinas[disc].mudaNome(entrada.nextLine());
			System.out.print("Nota: ");
			notasDisciplinas[disc].alteraNota(entrada.nextDouble());
			entrada.nextLine();
		}
		igor.preencheNotas(notasDisciplinas);
		igor.exibirDados();
		System.out.println(igor.mediaNotas());
		
		entrada.close();
	}

}

class Disciplina
{
	private String nome;
	private double nota;
	
	
	public Disciplina()
	{
		nome = "nenhum";
		nota = 0;
	}
	
	public void mudaNome (String novo)
	{
		nome = nome.replaceAll(nome,novo);
	}
	
	public void alteraNota (double nova)
	{
		nota = nova;
	}
	
	public void exibirInfo()
	{
		System.out.printf("%.2f pontos na disciplina %s\n", nota,nome);
	}
	
	public double obtemNota()
	{
		return nota;
	}
}
class Estudante
{
	private int idade;
	private String nome;
	private Disciplina[] notasDisciplinas;
	
	public Estudante()
	{
		idade = 0;
		nome = "nenhum";
		notasDisciplinas = new Disciplina[7];
	}
	
	public String obtemNome()
	{
		return nome;
	}
	
	public void alteraIdade (int nova)
	{
		idade = nova;
	}
	
	public void mudaNome (String novo)
	{
		nome = nome.replaceAll(nome, novo);
	}
	
	public void preencheNotas (Disciplina[] notas)
	{
		notasDisciplinas = notas;	
	}
	
	public void exibirNotas()
	{
		System.out.println("Notas do aluno " + nome);
		for (int i = 0; i < notasDisciplinas.length; i++)
		{
			notasDisciplinas[i].exibirInfo();
		}
		System.out.println();
	}
	
	public double mediaNotas ()
	{
		double soma = 0;
		for (int disc = 0; disc < notasDisciplinas.length; disc++)
		{
			soma = soma + notasDisciplinas[disc].obtemNota();
		}
		return (soma/notasDisciplinas.length);
	}
	
	public void exibirDados ()
	{
		System.out.println("Informações do aluno " + nome);
		System.out.println("Idade: " + idade);
		exibirNotas();
		System.out.printf("A média das notas é %.2f\n", mediaNotas());
	}
}