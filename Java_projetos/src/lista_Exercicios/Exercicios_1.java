package lista_Exercicios;

import java.util.Scanner;

public class Exercicios_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("A SOMA DE A + B = " + c);
		
		
		sc.close();

	}

}
