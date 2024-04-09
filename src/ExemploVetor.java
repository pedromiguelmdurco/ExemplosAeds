public class ExemploVetor {

	public static void main(String[] args) {
		int[] conjunto = new int[100];
		
		for (int i=0; i < conjunto.length; i++)
		{
			conjunto[i] = i+1;
		}
		
		for (int pos=0; pos < conjunto.length; pos++)
		{
			System.out.print(conjunto[pos] + " ");
		}
		System.out.println();
	}

}
