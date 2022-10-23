package exercicios;

import java.util.Scanner;

public class exe_17 {
	
	public static void main(String[] args) {
		
		double salario, novoSalario, bonific, aux; 
		
		Scanner s = new Scanner(System.in);
		System.out.println("Insira seu Salario: ");
		salario = s.nextInt();
		
		if (salario <= 500) {
			bonific = salario * 5 / 100;
		}else if(salario <= 1200) {
			bonific = salario * 12 / 100;
		}else {
			bonific = 0;
		}
		
		if(salario <= 600)
			aux = 150;
		else 
			aux = 100;
		
		novoSalario = salario + bonific + aux;
		
		System.out.println("Seu novo Salário sera de "+novoSalario);
		
		s.close();
		
	}
}


