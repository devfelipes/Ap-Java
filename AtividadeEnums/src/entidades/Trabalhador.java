package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.Level;

public class Trabalhador {
	private String nome;
	private Level level;
	private Double salarioBasico;
	
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();
	
	public Trabalhador() {}

	public Trabalhador(String nome, Level level, Double salarioBasico, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBasico = salarioBasico;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Double getSalarioBasico() {
		return salarioBasico;
	}

	public void setSalarioBasico(Double salarioBasico) {
		this.salarioBasico = salarioBasico;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void addContrato(Contrato contratos) {
		this.contratos.add(contratos);
	}
	public void delContrato(Contrato contratos) {
		this.contratos.remove(contratos);
	}
	public double income (int ano, int mes) {
		double soma = salarioBasico;
		Calendar cal = Calendar.getInstance();
		for (Contrato c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes ==c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
		
	}
}
