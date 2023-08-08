package lista_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main_Salary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero_funcionario;
		double horas_trabalhadas;
		double valor_por_hora;
		double salario;
		
		numero_funcionario = sc.nextInt();
		horas_trabalhadas = sc.nextDouble();
		valor_por_hora = sc.nextDouble();
		
		salario = horas_trabalhadas * valor_por_hora;
		
		System.out.println("O FUNCIONARIO NUMERO: " + numero_funcionario);
		System.out.println("RECEBEU O SALARIO DE R$: " + salario);
	
		sc.close();

	}

}
