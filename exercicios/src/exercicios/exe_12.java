package exercicios;

import java.util.Scanner;

public class exe_12 {

	public static void main(String[] args) {

		int num;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Insira um numero");
		num = s.nextInt();
		

		
		for(int i = 0; i < 11; i++) {
			System.out.println(num+" x "+i+" = "+i * num);
		}
		
		s.close();
	}

}
