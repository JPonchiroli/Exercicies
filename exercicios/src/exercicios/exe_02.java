package exercicios;

import java.util.Scanner;

public class exe_02 {
	
	public static void main(String[] args) {
		
		double salario, novoSalario;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o seu salario");
		salario = s.nextFloat();
		
		novoSalario = salario + (salario * 0.25);
		
		System.out.println("Seu novo salario e de "+novoSalario);
		
		s.close();
	}
}
