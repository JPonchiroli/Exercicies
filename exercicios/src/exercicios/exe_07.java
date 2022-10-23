package exercicios;

import java.util.Scanner;

public class exe_07 {

	public static void main(String[] args) {
		
		double salario, qntdQuilo, valorQuilo, valorBruto, valorDescontado;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o salario minimo");
		salario = s.nextDouble();
		System.out.println("Informe quantidade de quilowatts consumida");
		qntdQuilo = s.nextDouble();
		
		valorQuilo = salario / 5;
		valorBruto = qntdQuilo * valorQuilo;
		valorDescontado = valorBruto * 15 / 100;
		
		System.out.println("Cada quilowatt vale "+valorQuilo);
		System.out.println("O valor a ser pago vale "+valorBruto);
		System.out.println("O valor a ser pago com desconto vale "+valorDescontado);
		
		s.close();
		

	}

}
