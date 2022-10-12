import java.util.Locale;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o numero? " );
		int x = sc.nextInt();
		switch (x % 2) {
		case 0:
			System.out.println("Numero Par");
			break;
		default:
			System.out.println("Numero impar");
			break;
		}
		sc.close();
	}

}
