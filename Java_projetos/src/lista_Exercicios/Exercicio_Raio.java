package lista_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Raio {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double pi = 3.14159;
		double area;
	
		raio = sc.nextDouble();
		
		area = pi * (Math.pow(raio, 2));
		
		System.out.printf("A area = %.4f%n", area);
			
		sc.close();				
		
	}
}
