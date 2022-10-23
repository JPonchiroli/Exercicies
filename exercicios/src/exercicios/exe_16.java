package exercicios;

import java.util.Scanner;

public class exe_16 {
	
	public static void main(String[] args) {
		
		int escolha;
		double salario, impost, aument;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe seu Salario");
		salario = s.nextDouble();
		
		System.out.println("Menu de Opcoes: ");
		System.out.println("1. Imposto");
		System.out.println("2. Novo Salario");
		System.out.println("3. Classificação");
		escolha = s.nextInt();
		
		switch (escolha) {
		case 1: if (salario <= 500) {
			impost = salario * 0.95;
		}else if (salario <= 850) {
			impost = salario * 0.90;
		}else {
				impost = salario * 0.85;
			}
			System.out.println("Seu salario com imposto sera de "+impost);
			break;
			
		case 2: if (salario <= 450) {
			aument = salario + 100;
		}else if (salario <= 750) {
			aument = salario + 75;
		}else if (salario <= 1500) {
			aument = salario + 50;
		}else{
			aument = salario + 25;	
			}
			System.out.println("Seu salario com o aumento sera de "+aument);
			break;
			
		case 3: if(salario <= 700) 
			System.out.println("Mal Remunerado");
			else 
				System.out.println("Bem Remunerado");
			break;
		}
		
		s.close();	
	}
}

