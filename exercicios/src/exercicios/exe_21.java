package exercicios;

import java.util.Scanner;

public class exe_21{
	
	public static void main(String[] args) {
		
		int a, b, c, delta;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira o valor de A");
		a = s.nextInt();
		System.out.println("Insira o valor de B");
		b = s.nextInt();
		System.out.println("Insira o valor de C");
		c = s.nextInt();
		
		delta = b * b - 4 * a * c;
		
		if(delta > 0)
			System.out.println("Equacao possui duas raizes reias distintas, valor de delta: "+delta);
		else if(delta == 0)
			System.out.println("Equacao possui raizes iguais, valor de delta: "+delta);
		else
			System.out.println("Nao possui raizes reias, valor de delta "+delta);
		
		s.close();
	}
}


