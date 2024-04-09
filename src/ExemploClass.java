
public class ExemploClass {

	public static void main(String[] args) 
	{
		Casa luiz, mariana = new Casa(), iris= new Casa(), 
				janaina = new Casa(), gabriel = new Casa();
		int[] vetor = new int[10];
		
		luiz = new Casa();
		System.out.printf("Total de pessoas na casa do Luiz � %d\n",
				luiz.calcularOcupacaoAtual());
		luiz.mostrarPessoasNaCasa();
		System.out.println();
		
		System.out.printf("Total de pessoas na casa do Mariana � %d\n",
				mariana.calcularOcupacaoAtual());
		mariana.mostrarPessoasNaCasa();
		System.out.println();
		
		System.out.printf("Total de pessoas na casa do Iris � %d\n",
				iris.calcularOcupacaoAtual());
		iris.mostrarPessoasNaCasa();
		System.out.println();
		
		System.out.printf("Total de pessoas na casa do Janaina � %d\n",
				janaina.calcularOcupacaoAtual());
		janaina.mostrarPessoasNaCasa();
		System.out.println();
		
		System.out.printf("Total de pessoas na casa do Gabriel � %d\n",
				gabriel.calcularOcupacaoAtual());
		gabriel.mostrarPessoasNaCasa();
		System.out.println();
		
		luiz.colocarGente(1, 3);
		luiz.colocarGente(2, 1);
		luiz.colocarGente(3, 5);
		luiz.colocarGente(4, 2);
		luiz.colocarGente(5, 1);
		
		luiz.mostrarPessoasNaCasa();
		System.out.printf("Total de pessoas na casa do Luiz � %d\n",
				luiz.calcularOcupacaoAtual());
		
		mariana.colocarGente(5, 3);
		mariana.mostrarPessoasNaCasa();
		System.out.printf("Total de pessoas na casa do Mariana � %d\n",
				mariana.calcularOcupacaoAtual());
		
		System.out.println("Quarto 1 " + mariana.getQuarto1());
	}

}

class Casa
{
	private int quarto1, quarto2, sala, cozinha, banheiro;
	private String nome;
	private char codigo;
	
	public Casa ()
	{
		quarto1 = 0;
		quarto2 = 0;
		sala = 0;
		cozinha = 0;
		banheiro = 0;
		nome = "padr�o";
		codigo = 'c';
	}
	
	public void setQuarto1(int pessoas)
	{
		if (pessoas > 0 && pessoas <= 4) 
		{
			quarto1 = pessoas;
		}
	}
	public int getQuarto1 ()
	{
		return quarto1;
	}
	public void setQuarto2(int pessoas)
	{
		if (pessoas > 0 && pessoas <= 4) 
		{
			quarto2 = pessoas;
		}
	}
	public int getQuarto2 ()
	{
		return quarto2;
	}
	public void setSala(int sala)
	{
		if (sala > 0 && sala <= 4) 
		{
			this.sala = sala;
		}
	}
	public int getSala ()
	{
		return sala;
	}
	public void setCozinha(int pessoas)
	{
		if (pessoas > 0 && pessoas <= 4) 
		{
			cozinha = pessoas;
		}
	}
	public int getCozinha ()
	{
		return cozinha;
	}
	public void setBanheiro(int pessoas)
	{
		if (pessoas > 0 && pessoas <= 4) 
		{
			banheiro = pessoas;
		}
	}
	public int getBanheiro ()
	{
		return banheiro;
	}
	public void setNome(String novo)
	{
		if (novo != null) 
		{
			nome = nome.replaceAll(nome,novo);
		}
	}
	public String getNome ()
	{
		return nome;
	}
	public void setCodigo(char novo)
	{
		codigo = novo;
	}
	public char getCodigo ()
	{
		return codigo;
	}
	
	public void mostrarPessoasNaCasa ()
	{
		System.out.println("Ocupa��o atual da casa");
		System.out.printf("%d pessoas no quarto 1, %d pessoas "
				+ "no quarto 2, %d pessoas na sala, %d pessoas "
				+ "na cozinha, %d pessoas no banheiro\n", quarto1, 
				quarto2, sala, cozinha, banheiro);
	}
	public int calcularOcupacaoAtual ()
	{
		return (quarto1+quarto2+sala+cozinha+banheiro);
	}
	public double calcularMediaComodos ()
	{
		return (calcularOcupacaoAtual()/5);
	}
	
	public int consultarPessoas (int onde)
	{
		switch (onde)
		{
			case 1: return(getQuarto1()); 
			case 2: return quarto2;
			case 3: return sala;
			case 4: return cozinha;
			case 5: return banheiro;
			default:
				System.out.println("N�o existe este c�modo");
				return -1;
		}
	}
	public void colocarGente (int onde, int quantas)
	{
		switch (onde)
		{
			case 1: 
					if (quarto1+quantas <= 4)
					{
						quarto1 += quantas;
					}
				    break;
			case 2: quarto2 += quantas; 
				    break;
			case 3: sala += quantas;
			        break;
			case 4: cozinha += quantas;
					break;
			case 5: banheiro += quantas;
					break;
			default: System.out.println("N�o existe este c�modo");
					 break;
			
		}
	}
}