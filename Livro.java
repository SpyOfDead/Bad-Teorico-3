public class Livro {

	private String livro;
	private int quantidade;
	private String descrição;

	// Com quantidade
	Livro(String livro, int quantidade, String descrição) {
		
		this.livro = livro;
		this.quantidade = quantidade;
		this.descrição = descrição;

	}

	// Sem quantidade
	Livro(String livro, String descrição) {
		
		this.livro = livro;
		this.quantidade = 0;
		this.descrição = descrição;

	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	@Override
	public String toString() {
		return "Livro: " + livro + "\n" + "Quantidade: " + quantidade+ "\n" + "Descrição: " + descrição +"\n";
	}
	

}

