package Model;

public class Usuario {
	private String nome;
	private boolean ativo;
	private Filme filme;

	public Usuario() {
	}

	public Usuario(String nome, boolean ativo, Filme filme) {
		this.nome = nome;
		this.ativo = ativo;
		this.filme = filme;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
}
