package Entidades;


import java.util.Date;

import enuns.OrdemStatus;

public class Ordem {
	private Integer id;
	private Date momento;
	private OrdemStatus status;
	
	
	public Ordem() {}


	public Ordem(Integer id, Date momento, OrdemStatus status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getMomento() {
		return momento;
	}


	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public OrdemStatus getStatus() {
		return status;
	}


	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public String toString() {
		return "Ordem [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}

}
