package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Operacao;

public class Programa {

	public static void main(String[] args) {
		
		Operacao op;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe a conta: ");
		int conta = sc.nextInt();
		System.out.print("Quer iniciar com um valor na conta ? (S/N)");
		char p = sc.next().charAt(0);
		if (p == 's') {
			System.out.print("Informe o Valor inicial:");
			double valor = sc.nextDouble();
			op = new Operacao(nome,valor,conta);
		}
		else {
			op = new Operacao(nome,conta);
		}

		System.out.printf("Atualização:%n%s%n",op);
		char per;
		do{
			System.out.print("Qual ação você quer fazer: Adicionar valor (a); Retirar valor (r); sair (s)");
			per = sc.next().charAt(0);
			if (per =='a') {
				System.out.print("Informe o valor para adcionar: ");
				double valor = sc.nextDouble();
				op.addValor(valor);
				System.out.printf("Atualização:%n%s%n",op);
			} else if(per=='r') {
				System.out.print("Informe o valor para sacar: ");
				double valor = sc.nextDouble();
				op.sacValor(valor);
				System.out.printf("Atualização:%n%s%n",op);
			}
		}while (per!='s');
		
		sc.close();
	}
}
