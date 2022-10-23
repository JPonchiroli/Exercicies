package exercicios;

import java.util.Scanner;

public class exe_15 {

	public static void main(String[] args) {
		
		int cod, codPais, precoGrama = 0;
		double peso, pesoGramas,  precoTotal, imposto = 0, precoFinal;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Insira codigo do produto");
		cod = s.nextInt();
		System.out.println("Insira o codigo do pais");
		codPais = s.nextInt();
		System.out.println("Insira o peso do produto em quilos");
		peso = s.nextDouble();
		
		pesoGramas = peso * 1000;
		
		precoTotal = pesoGramas * precoGrama;
		
		if(cod < 4)
			precoGrama = 10;
		else if(cod < 7)
			precoGrama = 25;
		else if(cod <= 10)
			precoGrama = 35;
		
		precoTotal = pesoGramas * precoGrama;
		
		switch(codPais){
		case 1: 
			imposto = 0;
			break;
		case 2:
			imposto = precoTotal * 15 / 100;
			break;
		case 3:
			imposto = precoTotal * 25 / 100;
			
		}
		
		precoFinal = precoTotal - imposto;
		
		
		System.out.println("Peso do produto em gramas "+pesoGramas);
		System.out.println("Preco total do produto "+precoTotal);
		System.out.println("Valor do imposto "+imposto);
		System.out.println("Valor Final "+precoFinal);
		
		s.close();
		
	}

}


