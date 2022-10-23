package exercicios;

import java.util.Scanner;

public class exe_24 {

	public static void main(String[] args) {

		double valorFinal = 0.0;
		int codProduto = 0, qntdProduto;

		Scanner s = new Scanner(System.in);
		System.out.println("Insira quantas unidades vc deseja");
		qntdProduto = s.nextInt();
		System.out.println("Insira o codigo do produto");
		codProduto = s.nextInt();

		switch (codProduto) {
		case 100:
			valorFinal = qntdProduto * 1.20;
			break;
		case 101:
			valorFinal = qntdProduto * 1.30;
			break;
		case 102:
			valorFinal = qntdProduto * 1.50;
			break;
		case 103:
			valorFinal = qntdProduto * 1.20;
			break;
		case 104:
			valorFinal = qntdProduto * 1.30;
			break;
		case 105:
			valorFinal = qntdProduto * 1;
			break;
		default:
			System.out.println("Codigo Errado");

		}

		System.out.println("Valor do lanche: " + valorFinal);
		
		s.close();
		

	}
}
