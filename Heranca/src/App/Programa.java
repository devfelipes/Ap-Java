package App;

import Entidades.Conta;
import Entidades.ContaEmpresa;
public class Programa {

	public static void main(String[] args) {
		ContaEmpresa empresa = new ContaEmpresa(512,"Felipe",1000000, 10000);
		System.out.println(empresa.getNumero());

	}

}
