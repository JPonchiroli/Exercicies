package exercicios;

import java.util.Scanner;

public class exe_13 {

	public static void main(String[] args) {
		
		int cod;
		double salario, novoSalario = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Informe seu codigo");
		cod = s.nextInt();
		System.out.println("Informe seu salario");
		salario = s.nextDouble();
		
		switch(cod){
		case 1:
			novoSalario = salario + (salario * 50 / 100);
			break;
		case 2:
			novoSalario = salario + (salario * 35 / 100);
			break;
		case 3:
			novoSalario = salario + (salario * 30 / 100);
			break;
		case 4:
			novoSalario = salario + ((salario * 10) / 100);
			break;
		case 5:
			novoSalario = salario;
			break;
		}
			
		System.out.println("Valor do novo salario "+novoSalario);
		
		s.close();

	}

}

