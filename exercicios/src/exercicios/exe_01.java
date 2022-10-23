package exercicios;

import java.util.Scanner;

public class exe_01 {
	
	public static void main(String[] args) {
		
		double nota1, peso1, nota2, peso2, nota3, peso3, media;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira sua nota");
		nota1 = s.nextInt();
		System.out.println("Insira o peso da nota");
		peso1 = s.nextInt();
		
		System.out.println("Insira sua nota");
		nota2 = s.nextInt();
		System.out.println("Insira o peso da nota");
		peso2 = s.nextInt();
		
		System.out.println("Insira sua nota");
		nota3 = s.nextInt();
		System.out.println("Insira o peso da nota");
		peso3 = s.nextInt();
		
		media = nota1 * peso1 + nota2 * peso2 + nota3 * peso3 / peso1 + peso2 + peso3;
		
		System.out.println("A media ponderada e igual a: "+media);
		
		s.close();
	}
	
}
