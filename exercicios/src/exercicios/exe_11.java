package exercicios;

import java.util.Scanner;

public class exe_11 {

	public static void main(String[] args) {

		int n1, n2, n3;

		Scanner s = new Scanner(System.in);
		System.out.println("Insira um numero");
		n1 = s.nextInt();
		System.out.println("Insira um numero");
		n2 = s.nextInt();
		System.out.println("Insira um numero");
		n3 = s.nextInt();

		if ((n1 < n2) && (n2 < n3)) {
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		} else if ((n1 < n3) && (n3 < n2)) {
			System.out.println(n1);
			System.out.println(n3);
			System.out.println(n2);
		} else if ((n2 < n1) && (n1 < n3)) {
			System.out.println(n2);
			System.out.println(n1);
			System.out.println(n3);
		} else if ((n2 < n3) && (n3 < n1)) {
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n1);
		} else if ((n3 < n2) && (n2 < n1)) {
			System.out.println(n3);
			System.out.println(n2);
			System.out.println(n1);
		} else if ((n3 < n1) && (n1 < n2)) {
			System.out.println(n3);
			System.out.println(n1);
			System.out.println(n2);
			
			s.close();
		}

	}

}
