package exercicios;

import java.util.Scanner;

public class exe_14 {

	public static void main(String[] args) {

		double peso, altura;

		Scanner s = new Scanner(System.in);
		System.out.println("Insira sua altura em metros");
		altura = s.nextDouble();
		System.out.println("Insira seu peso");
		peso = s.nextDouble();

		if ((altura < 1.20) && (peso < 60.0))
			System.out.println("A");
		if ((altura < 1.20) && (peso <= 90.0))
			System.out.println("D");
		if ((altura < 1.20) && (peso > 90.0))
			System.out.println("G");
	
		if ((altura <= 1.70) && (peso < 60.0))
			System.out.println("B");
		if ((altura <= 1.70) && (peso <= 90.0))
			System.out.println("E");
		if ((altura <= 1.70) && (peso > 90.0))
			System.out.println("H");
	
		if ((altura > 1.70) && (peso < 60.0))
			System.out.println("C");
		if ((altura > 1.70) && (peso <= 90.0))
			System.out.println("F");
		if ((altura > 1.70) && (peso > 90.0))
			System.out.println("I");
		
		s.close();

	}

}

