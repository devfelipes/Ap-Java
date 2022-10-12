package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produtos [] vect = new Produtos[n];
		 
		
		for (int i=0; i<n ; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produtos(nome,preco);
		}
		double sum =0;
		for (int i=0; i<n ; i++) {
			sum += vect[i].getPreco();
		}
		
		double media = sum / n;
		
		System.out.println("Media= "+ media);
		
		
		sc.close();
	}

}
