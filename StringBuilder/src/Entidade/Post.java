package Entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat data = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
	private Date momento;
	private String titulo;
	private String contexto;
	private Integer likes;
	
	private List<Comentario> comentario= new ArrayList<>();

	public Post () {}
	public Post(Date momento, String titulo, String contexto, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.contexto = contexto;
		this.likes = likes;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContexto() {
		return contexto;
	}
	public void setContexto(String contexto) {
		this.contexto = contexto;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public List<Comentario> getComentario() {
		return comentario;
	}
	
	public void adicionarComentario (Comentario comentario) {
		this.comentario.add(comentario);
	}
	
	public void removerComentario (Comentario comentario) {
		this.comentario.remove(comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Titulo:");
		sb.append(titulo + "\n");
		sb.append("Likes: ");
		sb.append(likes + "\n");
		sb.append("Data: ");
		sb.append(data.format(momento) + "\n");
		sb.append("Contexto: ");
		sb.append(contexto + "\n");
		sb.append("Comentarios: ");
		for (Comentario c : comentario) {	
			sb.append(c.getTexto() + "\n");
		}
		
		return sb.toString();
	}
}
