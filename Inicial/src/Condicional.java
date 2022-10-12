import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hora;
		
		System.out.print("Qual horário?");
		hora = sc.nextDouble();
		if (hora < 6.00){
			System.out.println("Boa Madrugada");}
		else if (hora < 12.00){
			System.out.println("Bom dia");}
		else if(hora < 18.00){
			System.out.println("Boa tarde");}
		else {
			System.out.println("Boa noite");
		}
		sc.close();
	}

}
