package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entidade.Comentario;
import Entidade.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		
		Post post = new Post(data.parse("27/09/2022 22:37:20"), "Aprendendo Java", "Java é legal", 150);
		
		post.adicionarComentario( new Comentario("Isso ai"));
		post.adicionarComentario( new Comentario("Parabéns"));
		
		System.out.println(post);
		
		
		
		
		
		

	}

}
