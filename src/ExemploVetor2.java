
public class ExemploVetor2 {

	public static void main(String[] args) {
		
		int[] conjunto = new int[10];
		int num =1, atual = 0;
		/*
		for(int i = 0; i < conjunto.length; i++)
		{
			
			conjunto[i] = num;
			num+=2;
			
		}
		*/
		
		for(int i = 1; i <= 20; i++)
		{
			if(i%2 != 0)
			{
				conjunto[atual] = 1;// gravar impar na posiçao atual
				atual++;//proxima posiçao para gravar
			}
		}
		
		for(int pos = 0; pos < conjunto.length; pos++)
		{
			
			System.out.println(conjunto[pos]);
			
		}
		
	}

}
