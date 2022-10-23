package exercicios;

import java.util.Scanner;

public class exe_10 {

	public void main(String[] args) {

		double nota1, nota2, nota3, media;

		Scanner s = new Scanner(System.in);
		System.out.println("Insira sua nota do Trabalho de laboratorio");
		nota1 = s.nextDouble();
		System.out.println("Insira sua nota da Avaliacao trimestral");
		nota2 = s.nextDouble();
		System.out.println("Insira sua nota no Exame Final");
		nota3 = s.nextDouble();

		media = nota1 + nota2 + nota3 / 3;

		if (media <= 10)
			System.out.println("Conceito A");
		else if (media <= 8)
			System.out.println("Conceito B");
		else if (media <= 7)
			System.out.println("Conceito C");
		else if (media <= 6)
			System.out.println("Conceito D");
		else if (media <= 5)
			System.out.println("Conceito E");

		s.close();
	}
}
