package lista_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main_Pecas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo_peca1, codigo_peca2;
		int qntd1, qntd2;
		double preco1, preco2;
		double valor_da_venda;
		
		codigo_peca1 = sc.nextInt();
		qntd1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		codigo_peca2 = sc.nextInt();
		qntd2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		valor_da_venda = preco1 + preco2;
		
		System.out.println("Codigo: " + codigo_peca1);
		System.out.println("Quantidade estoque: " + qntd1);
		System.out.println("Codigo: " + codigo_peca2);
		System.out.println("Quantidade estoque: " + qntd2);
		System.out.println("Valor a pagar: R$ " + valor_da_venda);
		
		sc.close();
		
	}

}
