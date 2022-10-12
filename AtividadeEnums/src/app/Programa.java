package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.Level;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("ddd/MM/yyyy");
		
		
		System.out.println("Qual o departamento");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Dados do trarbalhador");
		System.out.print("Nome:");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Level:");
		String levelTrabalhador = sc.nextLine();
		System.out.print("Salario Base:");
		double salarioTrabalhador = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, Level.valueOf(levelTrabalhador), salarioTrabalhador, new Departamento(nomeDepartamento));
	
		
		System.out.println("Quantos contratos:");
		int n = 1+ sc.nextInt();
		
		for (int i=1; i<n; i++) {
			System.out.println(" Informe o " +i+ " Contrato:");
			System.out.print("Qual a data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();
			Contrato contrato = new Contrato(dataContrato, valorPorHora ,horas );
			trabalhador.addContrato(contrato);
		}
		System.out.println();
		System.out.println("Entre com o mes e ano para o calculo: (MM/YYYY): ");
		String meseano =sc.next();
		int mes = Integer.parseInt(meseano.substring(0,2));
		int ano = Integer.parseInt(meseano.substring(3));
		System.out.println("Name: "+trabalhador.getNome());
		System.out.println("Departamento: "+trabalhador.getDepartamento().getNome());
		System.out.println("O Trabalhador ganhou "+meseano+":"+ String.format("%.2f", trabalhador.income(ano,mes)));
		sc.close();
	}

}
