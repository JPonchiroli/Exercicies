package exercicios;

import java.util.Scanner;

public class exe_23 {

	public static void main(String[] args) {

		double valorFinal = 0.0;
		int codProduto = 0, qntdProduto;

		Scanner s = new Scanner(System.in);
		System.out.println("Insira quantas unidades vc deseja");
		qntdProduto = s.nextInt();
		System.out.println("Insira o codigo do produto");
		System.out.println("1- 1001		2- 1324");
		System.out.println("3- 6548		4- 0987");
		System.out.println("5- 7623	           ");
		codProduto = s.nextInt();

		switch(codProduto) {
		case 1: valorFinal = qntdProduto * 5.32;
			break;
		case 2: valorFinal = qntdProduto * 6.45;
			break;
		case 3: valorFinal = qntdProduto * 2.37;
			break;
		case 4: valorFinal = qntdProduto * 5.32;
			break;
		case 5: valorFinal = qntdProduto * 6.45;
			break;
			default: System.out.println("Codigo Incorreto");

		}

		System.out.println("Preco total sera de: " + valorFinal);
		
		s.close();

	}
}
