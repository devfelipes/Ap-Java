package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar: ");
		int n = sc.nextInt();
		
		Product[] vetor = new Product[n];
		
		for (int i=0; i< vetor.length; i++) {
			System.out.print("Informe o numero: ");
			int num = sc.nextInt();
			vetor[i] = new Product(num);
		}
		
		for(int i=0; i<vetor.length; i++) {
			int num = vetor[i].getNumero();
			if (num < 0) {
				System.out.println("Numero negativo : " + num);
			}
		}	
		for(int i=0; i<vetor.length; i++) {
			int num = vetor[i].getNumero();
			if (num > 0) {
				System.out.println("Numero positivo : " + num);
			}
		}
		sc.close();
	}

}
