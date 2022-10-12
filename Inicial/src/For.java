import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		for (int i=0; i<x; i++) {
			int y = sc.nextInt();
			soma += y;
		};
		System.out.printf("A soma é %d", soma);
		sc.close();
	}

}
