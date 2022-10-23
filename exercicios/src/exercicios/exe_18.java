package exercicios;

import java.util.Scanner;

public class exe_18 {
	
	public static void main(String[] args) {
		
		float salarioMin, numHoras = 0, numDependentes = 0, horaExtra = 0;
		float valorHora, salarioMes, valorDependentes, valorHExtra, salarioBruto;
		float valorImposto, salarioLiquido, gratificacao, salarioFinal;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o salario minimo");
		salarioMin = s.nextFloat();
		System.out.println("Informe o numero de horas");
		numHoras = s.nextFloat();
		System.out.println("Informe o numero de dependentes");
		numDependentes = s.nextFloat();
		System.out.println("Informe o numero de hora extra trabalhada");
		horaExtra = s.nextFloat();
		
		valorHora = salarioMin / 5;
		
		salarioMes = numHoras * valorHora;
		
		valorDependentes = numDependentes * 32;
		
		valorHExtra = (valorHora * 1.5f * horaExtra);
		
		salarioBruto = salarioMes + valorDependentes + valorHExtra;
		
		if (salarioBruto > 500)
			valorImposto = salarioBruto * 0.20f;
		else if (salarioBruto < 200)
			valorImposto = 0;
		else
			valorImposto = salarioBruto * 0.10f;
		
		salarioLiquido = salarioBruto - valorImposto;
		
		if (salarioLiquido > 350)
			gratificacao = 50;
		else
			gratificacao = 100;
		
		
		salarioFinal = salarioLiquido + gratificacao;
		
		System.out.println("A) Valor hora Trabalhada "+valorHora);
		System.out.println("B) Salário do Mês "+salarioMes);
		System.out.println("C) Valor Dependente "+valorDependentes);
		System.out.println("D) Valor Hora Extra "+valorHExtra);
		System.out.println("E) Valor Salário Bruto "+salarioBruto);
		System.out.println("F) Valor Imposto "+valorImposto);
		System.out.println("G) Valor Salário Liquido "+salarioLiquido);
		System.out.println("H) Valor Gratificacao "+gratificacao);
		System.out.println("I) Salario a receber "+salarioLiquido);
		System.out.println("J) Salario Final "+salarioFinal);
		
		s.close();
		
	}
}


