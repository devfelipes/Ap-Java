import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//CRIANDO VARIAVEIS
		double altura = 1.85;
		String nome = "Felipe";
		int idade = 19;
		double renda = 10500.00;
		//COLOCANDO A FORMA DOS EUA
		Locale.setDefault(Locale.US);
		//CRIANDO A VAREAVEL DO SCANNER PARA O USUARIO DAR O VALOR
		Scanner sc = new Scanner(System.in);
		//CHAMANDO A VAREAVEL DO SCANNER EM OUTRA VAREAVEL
		char x = sc.next().charAt(0);
		//PRINTANDO NA TELA OS VALORES
		System.out.println(x);
		System.out.printf("Nome: %s%nIdade: %d%nRenda: %.2f%nAltura: %.2f", nome,idade,renda,altura);
		sc.close();
	}

}
