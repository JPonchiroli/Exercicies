package exercicios;

import java.util.Scanner;

public class exe_06 {

	public static void main(String[] args) {
		
		double salario, horasTrabalhadas, salBruto, horaTrabalhada, imposto, salFinal;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o salario");
		salario = s.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas");
		horasTrabalhadas = s.nextDouble();
		
		
		horaTrabalhada = salario /2;
		salBruto = horasTrabalhadas * horaTrabalhada;
		imposto = salBruto * 3 / 100;
		salFinal = salBruto - imposto;
	
		System.out.println("A hora trabalha vale "+horaTrabalhada);
		System.out.println("O salario bruto vale "+salBruto);
		System.out.println("O imposto vale "+imposto);
		System.out.println("O salario final e de "+salFinal);
		
		s.close();
		
	}

}
