package Entidades;

public class FuncionarioTercerizado extends Funcionario{
	private Double adicional;
	
	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, Double horas, Double valor, Double adicional) {
		super(nome, horas, valor);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public Double pagamento () {
		return super.pagamento() + (adicional * 0.10);
	}
}
