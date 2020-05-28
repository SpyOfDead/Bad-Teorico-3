import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsuarioTest {
	
	Biblioteca livros = new Biblioteca();

	@Test
	void testeAlugarLivro() {
		
		livros.adicionarLivroQuantidade("Teste", 2, "Teste");
		Livro aux = livros.procurarLivro("Teste");
		
		Usuario usuario = new Usuario("Vinicius",livros);
		assertEquals("Certificando de que esta vazio",0,usuario.getLivrosAlugados().size());
		
		usuario.alugarLivro("Teste");
		assertEquals("Certificando de que foi adicionado o livro",1,usuario.getLivrosAlugados().size());
		
		assertEquals("Certificando de que foi adicionado o livro",aux,usuario.getLivrosAlugados().get(0));

		
	}
	
	@Test
	void testeDevolverLivro() {
		
		livros.adicionarLivroQuantidade("Teste", 2, "Teste");
		
		Usuario usuario = new Usuario("Vinicius",livros);
		usuario.alugarLivro("Teste");
		assertEquals("Certificando de que não esta vazio",1,usuario.getLivrosAlugados().size());
		
		
		usuario.devolverLivro("Teste");
		assertEquals("Certificando de que foi removido o livro",0,usuario.getLivrosAlugados().size());

		
	}
	

}
