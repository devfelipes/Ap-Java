package Entidades;

public class Funcionario {
	private String nome;
	private Double horas;
	private Double valor;
	
	public Funcionario (){}

	public Funcionario(String nome, Double horas, Double valor) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getHoras() {
		return horas;
	}

	public void setHoras(Double horas) {
		this.horas = horas;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double pagamento() {
		return getValor() * getHoras();
	}
	
}
