import java.util.*;

public class Usuario {
	
	private ArrayList<Livro> livrosAlugados;
	private String nome;
	private Biblioteca biblioteca;
	private static int total = 0;

	Usuario(String nome, Biblioteca biblioteca){
		
		total++;
		this.biblioteca = biblioteca;
		this.nome = nome;
		livrosAlugados = new ArrayList<Livro>();
		
	}

	boolean alugarLivro(String livro) {
		Livro livroAux = biblioteca.alugarLivro(livro);
		if(livroAux != null) {
			livrosAlugados.add(livroAux);
			return true;
		}
		return false;
	}
	
	boolean devolverLivro(String livro) {
		boolean aux = biblioteca.devolverLivro(livro);
		if(aux) {
			
			Livro livroAux = biblioteca.procurarLivro(livro);
			livrosAlugados.remove(livroAux);
			return true;
		}
		return false;
	}
	
	public String getNome() {
		return nome;
	}
	
	public static int getTotal() {
		return total;
	}

	public ArrayList<Livro> getLivrosAlugados() {
		return livrosAlugados;
	}

	@Override
	public String toString() {
		
		String aux = "Nome: "+ nome +"\n"+ "Total de Usuarios: "+ total +"\n";
		for(int i = 0;i < livrosAlugados.size();i++) {
			
			aux = aux + livrosAlugados.get(i);
		}
		return aux;
	}
	
}
