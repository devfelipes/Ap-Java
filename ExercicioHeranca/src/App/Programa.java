package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.FuncionarioTercerizado;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print(" Qual a quantidade de pessoas?");
		Integer qnt = sc.nextInt();
		List <Funcionario> funcionario = new ArrayList<>();
		
		for (int i=1; i<=qnt; i++) {
			System.out.println();
			System.out.println("Funcionario: "+i);
			System.out.print(" Funcionario é tercerizado ? (y/n) ");
			char ter = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			Double horas = sc.nextDouble();
			System.out.print("Valor: ");
			Double valor = sc.nextDouble();
			if (ter =='y') {
				System.out.print("Adcional: ");
				Double adicional = sc.nextDouble();
				funcionario.add(new FuncionarioTercerizado(nome,horas,valor,adicional));} 
			else {
				funcionario.add(new Funcionario(nome,horas,valor));}

		}
		
		System.out.println("Pagamentos:");
		for (Funcionario c : funcionario) {
			System.out.println(c.getNome()+" - R$" + c.pagamento());	
		}
		sc.close();

	}

}
