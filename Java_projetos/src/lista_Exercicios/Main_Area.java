package lista_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main_Area {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double pi = 3.14159;
		double area_triangulo,area_circulo,
		area_trapezio,area_quadrado, area_retangulo; 
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
	
		area_triangulo = (A * C) / 2;
		area_circulo = pi * C;
		area_trapezio = ((A + B)* C) / 2;
		area_quadrado =  B * B;
		area_retangulo = A * B;
		
		System.out.println("Area triangulo:" + area_triangulo);
		System.out.println("Area ciculo:" + area_circulo);
		System.out.println("Area trapezio:" + area_trapezio);
		System.out.println("Area quadrado:" + area_quadrado);
		System.out.println("Area retangulo:" + area_retangulo);
		
		sc.close();

	}

}
