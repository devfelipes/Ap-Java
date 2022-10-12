package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Entities;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a largura: ");
		double largura = sc.nextDouble();
		System.out.print("Informe a altura: ");
		double altura = sc.nextDouble();
		Entities ent = new Entities();
		ent.altura = altura;
		ent.largura = largura;
		System.out.print(ent);
		sc.close();
	}

}
