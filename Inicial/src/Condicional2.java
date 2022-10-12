import java.util.Locale;
import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double conta = 50.0;
		System.out.print("Quantos minutos? ");
		int minutos = sc.nextInt();
		if (minutos >100) {
			conta += (minutos - 100) * 2;
		}
		System.out.printf("Valor a pagar: R$%.2f",conta);
		sc.close();
	}

}
