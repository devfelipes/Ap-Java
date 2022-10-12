package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Program {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quartos disponíveis 10. Quantos aluguel:");
		int n = sc.nextInt();
		
		Vetor[] vec = new Vetor[10];
		
		for  (int i=0; i<n; i++) {
			int q = i + 1;
			System.out.printf("%d Quarto: ",q);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("quarto: ");
			int quarto = sc.nextInt();
			if (vec[quarto] != null) {
				vec[quarto] = new Vetor(nome,email,quarto);
				
			}
		
		}

		sc.close();
	}
}
