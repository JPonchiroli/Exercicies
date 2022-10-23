package exercicios;

import java.util.Scanner;

public class exe_03 {
	
	public static void main(String[] args) {
		
		double salario, aumento, imposto, tot;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o salario");
		salario = s.nextInt();
		
		aumento = salario * 0.05;
		imposto = salario * 0.07;
		tot = salario + aumento - imposto;
		
		System.out.println("O novo salario e "+tot);
		
		s.close();
	}
}
