package Entities;

public class Operacao {

	private double valor;
	private String nome;
	private int conta;
	
	public Operacao(String nome,double valorinicial, int conta) {
		addValor(valorinicial);
		this.nome = nome;
		this.conta = conta;
	}
	public Operacao(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}
	
	public String getNome() {
		return nome ;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public int getConta() {
		return conta;	
	}

	public void addValor(double valor) {
		this.valor += valor;
	}
	public void sacValor (double valor) {
		this.valor -= valor + 5; 
	}
	public String toString() {
		return "Conta= "+getConta()+"; Nome= "+getNome()+"; Valor= R$"+String.format("%.2f",getValor());
	}
}
