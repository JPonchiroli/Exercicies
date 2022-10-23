package exercicios;

import java.util.Scanner;

public class exe_22 {

	public static void main(String[] args) {

		double saldoMedio, percentual = 0;
		int contaSaldo = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Insira o saldo medio");
		saldoMedio = s.nextDouble();

		if (saldoMedio <= 200)
			contaSaldo = 1;
		else if (saldoMedio <= 400)
			contaSaldo = 2;
		else if (saldoMedio <= 600)
			contaSaldo = 3;
		else
			contaSaldo = 4;

		switch (contaSaldo) {
		case 1:
			percentual = saldoMedio;
			break;
		case 2:
			percentual = saldoMedio * 0.20;
			break;
		case 3:
			percentual = saldoMedio * 0.30;
			break;
		case 4:
			percentual = saldoMedio * 0.40;
			break;
		default:
			System.out.println("Nao atende os requisitos");

		}

		System.out.println("Saldo Medio: " + saldoMedio);
		System.out.println("Valor do Credito: " + percentual);

		s.close();

	}
}
