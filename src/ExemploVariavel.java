import java.util.Scanner;

public class ExemploVariavel {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int x, y, z, resultado;
		
		System.out.print("Digite um valor: ");
		x = entrada.nextInt();
		
		System.out.print("Digite outro valor: ");
		y = entrada.nextInt();
		
		System.out.print("Digite �ltimo valor: ");
		z = entrada.nextInt();
		
		resultado = x + y + z;
		
		System.out.println("A soma dos valores � " + resultado);
		System.out.println("A soma dos valores � " + (x + y +z));
		
		entrada.close();

	}

}
