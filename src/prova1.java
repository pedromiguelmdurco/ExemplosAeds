import java.util.Scanner;

public class prova1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*int valor, cont, total, valor2;

		System.out.print("Digite um valor e veja a tabela de potencia");
		valor = entrada.nextInt();

		valor2 =valor;
		
		for(cont = 1; cont < 11; cont++)

		{

		total = valor2*valor;

		valor2 = total;	
		
		System.out.println(valor+" elevado a "+cont+" = "+total);

		}*/
		
		int quant=1, prod, total;
		double preco=0, promo;
		
		
		System.out.print("Qual o codigo do produto: ");
		prod = entrada.nextInt();
		System.out.print("Quantidade que você comprou:");
		quant = entrada.nextInt();
		
		
		if(prod >= 1 && prod <= 10)
		{
			
			preco = 10;
			
		}else if (prod>=11 && prod<=20)
		{
			
			preco = 15;
			
		}
		else if (prod>=21 && prod<=30)
		{
			
			preco = 20;
			
		}else if (prod >= 31 && prod <= 40)
		{
		
			preco =30;
		
		}else
		{
			System.out.print("Valor de codigo invalido");
		}
		
		total =(int) ((double)preco *quant) ;
		
	
		System.out.println("O preço de uma unidade é: R$"+ preco);
		
		System.out.println("O valor total é: R$"+total);
		
		if(total<= 250) 
		{
			promo = total *0.05;
			System.out.println("O desconto é de 5%: R$"+promo);
			
		}else if(total>= 250 && total <=500)
		{
			promo = total*0.10;
			System.out.println("O desconto é de 10%: R$"+promo);
			
		}else
		{
			promo = total *0.15;
			System.out.println("O desconto é de 15%: R$"+promo);
			
		}
		
		System.out.println("O valor final a se pagar será: R$"+(total-promo));
		
		entrada.close();

	}

}
