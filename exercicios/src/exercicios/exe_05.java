package exercicios;

import java.util.Scanner;

public class exe_05 {

	public static void main(String[] args) {
		
		double medida, pe, jarda, milha;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Insira a quantidade para ser convertida");
		medida =s.nextDouble();
		
		pe = medida*12;
		jarda = medida/3;
		milha = medida/(1760*3);
		
		System.out.println("Medida em pes "+medida);
		System.out.println("Medida em polegadas "+pe);
		System.out.println("Medida em jardas "+jarda);
		System.out.println("Medida em milhas "+milha);
		
		s.close();
	}

}
