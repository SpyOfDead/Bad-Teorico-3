import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BibliotecaTest {
	
	@Test
	public void testeAdicionarLivroQuantidade() {
		
		Biblioteca livros = new Biblioteca();
		
		assertTrue("Certificando que deu true", livros.adicionarLivroQuantidade("Vinicius",3,"Pequeno teste"));
		assertFalse("Certificando que deu false", livros.adicionarLivroQuantidade("Vinicius",3,"Pequeno teste"));

	}
	
	@Test
	public void testeAdicionarLivro() {
		
		Biblioteca livros = new Biblioteca();
		
		assertTrue("Certificando que deu true", livros.adicionarLivro("Vinicius","Pequeno teste"));
		assertFalse("Certificando que deu false", livros.adicionarLivro("Vinicius","Pequeno teste"));

	}
	
	@Test
	public void testeProcurarLivro() {
		
		Biblioteca livros = new Biblioteca();
		assertNull("Certificando que deu NULL",livros.procurarLivro("Vinicius"));
		
		livros.adicionarLivro("Vinicius","Pequeno teste");
		assertNotNull("Certificando que deu diferente de NULL",livros.procurarLivro("Vinicius"));
	}
	
	@Test
	public void testeAlugarLivro() {
		
		Biblioteca livros = new Biblioteca();
		livros.adicionarLivroQuantidade("Vinicius", 3, "Pequeno teste");
		Livro aux = livros.procurarLivro("Vinicius");
		livros.alugarLivro("Vinicius");
		assertEquals("Certificando que e quantidade de livro e iqual a 2", 2 ,aux.getQuantidade());
		livros.alugarLivro("Vinicius");
		assertEquals("Certificando que e quantidade de livro e iqual a 1", 1 ,aux.getQuantidade());
		
	}
	
	@Test
	public void testeDevolverLivro() {
		
		Biblioteca livros = new Biblioteca();
		livros.adicionarLivro("Vinicius","Pequeno teste");
		Livro aux = livros.procurarLivro("Vinicius");
		livros.devolverLivro("Vinicius");
		assertEquals("Certificando que e quantidade de livro e iqual a 1", 1 ,aux.getQuantidade());
		livros.devolverLivro("Vinicius");
		assertEquals("Certificando que e quantidade de livro e iqual a 2", 2 ,aux.getQuantidade());
	}
	@Test
	public void testeRemoverLivro() {
		
		Biblioteca livros = new Biblioteca();
		livros.adicionarLivroQuantidade("Vinicius", 2, "pequeno teste");
		assertTrue("Certificando que da true quando encontra o livro",livros.removerLivro("Vinicius"));
		
		assertFalse("Certificando que da false quando não encontra o livro",livros.removerLivro("Teste"));
	}

}
