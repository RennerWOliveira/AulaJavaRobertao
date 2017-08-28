//pacote igual a namespace
package br.com.rennerblog;

public class Livro {
	
	// public = Visivel por todas as classes
	// private = Somente a propria classe encherga
	// protected = Visivel por filhos
	// package = Visivel pelo pacote
	
	private String titulo;
	
	private String autor;
	
	private String editora;
	
	private int edicao;
	
	private int quantidadeDePagina;
	
	private String assunto;
	
	private float preco = 3.3f;
	
	private int anoPublicacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getQuantidadeDePagina() {
		return quantidadeDePagina;
	}

	public void setQuantidadeDePagina(int quantidadeDePagina) {
		this.quantidadeDePagina = quantidadeDePagina;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	
	
}
