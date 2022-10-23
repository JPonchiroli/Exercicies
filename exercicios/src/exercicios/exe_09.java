package exercicios;

import java.util.Scanner;

public class exe_09 {

	public static void main(String[] args) {
		
		double hora, horaMinuto;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe a hora");
		hora = s.nextDouble();
		
		horaMinuto = hora * 60;
		
		System.out.println("A hora em minutos vale "+horaMinuto);
		
		s.close();

		

	}

}
