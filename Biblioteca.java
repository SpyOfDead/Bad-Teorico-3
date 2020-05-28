import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Livro> livros;
	private static int total;

	Biblioteca() {

		total = 0;
		livros = new ArrayList();

	}

	boolean removerLivro(String livro) {
		Livro aux = procurarLivro(livro);
		if (aux != null) {
			livros.remove(aux);
			return true;
		}
		return false;
	}

	boolean adicionarLivro(String livro1, String Descrição) {

		Livro livro = new Livro(livro1, Descrição);
		Livro aux = procurarLivro(livro1);

		if (aux == null) {

			total++;
			livros.add(livro);
			return true;

		}
		return false;

	}

	boolean adicionarLivroQuantidade(String livro1, int Quantidade, String Descrição) {

		Livro livro = new Livro(livro1, Quantidade, Descrição);
		Livro aux = procurarLivro(livro1);

		if (aux == null) {

			total++;
			livros.add(livro);
			return true;

		}
		return false;

	}

	Livro procurarLivro(String livro) {

		for (int i = 0; i < livros.size(); i++) {

			if (livros.get(i).getLivro() == livro) {

				return livros.get(i);

			}
		}

		return null;

	}

	Livro alugarLivro(String livro) {

		Livro aux = procurarLivro(livro);
		if (aux != null) {

			if (aux.getQuantidade() > 0) {
				aux.setQuantidade(aux.getQuantidade() - 1);
				return aux;
			}
		}
		return null;

	}

	boolean devolverLivro(String livro) {

		Livro aux = procurarLivro(livro);
		if (aux != null) {

			aux.setQuantidade(aux.getQuantidade() + 1);
			return true;

		}
		return false;
	}

	@Override
	public String toString() {

		String aux = "Livros";

		for (int i = 0; i < livros.size(); i++) {
			aux = aux + "Livro: " + i + "\n" + livros.get(i).toString();
		}

		return aux;
	}

}
