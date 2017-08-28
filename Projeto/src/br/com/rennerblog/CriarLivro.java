package br.com.rennerblog;

public class CriarLivro {
	
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.setTitulo("Java - Uma introdução prática usando o BlueJ");
		livro.setAutor("Kolling Barnes");
		livro.setEditora("Pearson");
		livro.setAssunto("Tecnologia");
		livro.setEdicao (4);
		livro.setQuantidadeDePagina(455);
		livro.setAnoPublicacao(2008);
		
		Livro outroLivro = new Livro();
		
		outroLivro.setTitulo("Redes neurais com python usando o PyBrain");
		outroLivro.setAutor("Kolling Barnes");
		outroLivro.setEditora("Pearson");
		outroLivro.setAssunto("Tecnologia");
		outroLivro.setEdicao (2);
		outroLivro.setQuantidadeDePagina(300);
		outroLivro.setAnoPublicacao(2016);
		
		System.out.println("Livro 1 -");
		System.out.println("Titulo: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
		
		System.out.println();
		
		System.out.println("Livro 2 -");
		System.out.println("Titulo: " + outroLivro.getTitulo());
		System.out.println("Quantidade de Paginas: " + outroLivro.getQuantidadeDePagina());
		System.out.println("Assunto: " + outroLivro.getAssunto());
		
	}

}
