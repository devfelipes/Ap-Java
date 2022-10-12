package Entidades;

public class ContaEmpresa extends Conta{
	private double saqueSaldo ;
	
	public ContaEmpresa () {
		super();
	}

	public ContaEmpresa(Integer numero, String titular, double saldo, double saqueSaldo) {
		super(numero, titular, saldo);
		this.saqueSaldo = saqueSaldo;
	}

	public double getSaqueSaldo() {
		return saqueSaldo;
	}

	public void setSaqueSaldo(double saqueSaldo) {
		this.saqueSaldo = saqueSaldo;
	}
	public void emprestimo(double valor) {
		if (valor <= saqueSaldo) {	
			deposito(valor);}
		}
}
