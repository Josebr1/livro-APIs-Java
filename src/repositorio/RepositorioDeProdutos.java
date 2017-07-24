package repositorio;


import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RepositorioDeProdutos {

	public ObservableList<Produto> lista(){
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789.10");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		
		Livro maisUmLivro = new LivroFisico(autor);
		maisUmLivro.setNome("Java 8 Prático");
		maisUmLivro.setDescricao("Novos recursos da linguagem");
		maisUmLivro.setValor(59.90);
		maisUmLivro.setIsbn("978-85-66250-46-6");
		
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Rodrigo Turini");
		outroAutor.setEmail("rodrigo.turini@caelum.com.br");
		outroAutor.setCpf("123.456.789.10");
		
		Livro outroLivro = new LivroFisico(outroAutor);
		outroLivro.setNome("Java 8 Prático");
		outroLivro.setDescricao("Novos recursos da linguagem");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-46-6");
		
		
		return FXCollections.observableArrayList(livro, maisUmLivro, outroLivro);
	}
}
