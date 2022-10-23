package exercicios;

import java.util.Scanner;

public class exe_20 {
	
	public static void main(String[] args) {
		
		float valorProduto, valorFinal = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o preço do produto");
		valorProduto = s.nextFloat();
		
		if(valorProduto < 20)
			valorFinal = valorProduto * 1.45f;
		else
			valorFinal = valorProduto * 1.30f;
		
		System.out.println("O valor da venda sera de "+valorFinal);
		
		s.close();
	}
}


