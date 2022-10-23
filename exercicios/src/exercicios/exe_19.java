package exercicios;

import java.util.Scanner;

public class exe_19{
	
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um lado");
		num1 = s.nextInt();
		System.out.println("Informe um lado");
		num2 = s.nextInt();
		System.out.println("Informe um lado");
		num3 = s.nextInt();
		
		if((num1 == num2) && (num2 == num3))
			System.out.println("Triangulo Equilatero");
		else if((num1 == num2) || (num1 == num3) || (num2 == num3))
			System.out.println("Triangulo Isosceles");
		else
			System.out.println("Triangulo Escaleno");
		
		s.close();
	}
}


