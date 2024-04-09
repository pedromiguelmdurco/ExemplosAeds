import java.util.Scanner;

public class ExemploVetor4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] conjunto = new int[10];
		
		for(int i=0; i <conjunto.length; i ++)
		{
			System.out.println("Digite: ");
			conjunto[i] = entrada.nextInt() / 2;
		}
		
		for(int pos = 0; pos < conjunto.length;pos++)
		{
			System.out.println(conjunto[pos]+" ");
		}
		System.out.println();
		
		entrada.close();

	}

}
