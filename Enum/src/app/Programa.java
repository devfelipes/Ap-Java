package app;



import java.util.Date;

import Entidades.Ordem;
import enuns.OrdemStatus;

public class Programa {

	public static void main(String[] args) {
		Ordem ordem = new Ordem(100, new Date(), OrdemStatus.PENDENTE_PAGAMENTO);
		System.out.println(ordem);
	}	

}
