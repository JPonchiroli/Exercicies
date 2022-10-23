package exercicios;

import java.util.Scanner;

public class exe_04 {
	
	public static void main(String[] args){
		
		double valorVeic, lucro, imposto, tot;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o preco de fabrica do veiculo");
		valorVeic = s.nextDouble();
		System.out.println("Informe o percentual de lucro");
		lucro = s.nextDouble();
		System.out.println("Informe o percentual de imposto");
		imposto = s.nextDouble();
		
		tot = valorVeic + (valorVeic * (lucro / 100) - (valorVeic * (imposto / 100)));
		
		System.out.println("O valor do lucro e de "+valorVeic * (lucro / 100));
		System.out.println("O valor do imposto e de "+valorVeic * (imposto / 100));
		System.out.println("O preco final e de "+tot);
		
		s.close();
		
		
		
	}
}
