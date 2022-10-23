package exercicios;

import java.util.Scanner;

public class exe_08 {

	public static void main(String[] args) {
		
		int custo, preco, meta;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o custo do espetaculo");
		custo = s.nextInt();
		System.out.println("Insira o preco do convite");
		preco = s.nextInt();
		
		meta = custo / preco;
		
		System.out.println("A quantidades de convites de ser de "+meta);
		
		s.close();
		
	}

}
