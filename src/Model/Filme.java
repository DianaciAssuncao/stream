package Model;

public class Filme {
	private String titulo;
	private int ano;
	private String diretor;
	private String ator;
	private String gênero;
	
	public Filme() { }

	public Filme(String titulo, int ano, String diretor, String ator, String gênero) {
		this.titulo = titulo;
		this.ano = ano;
		this.diretor = diretor;
		this.ator = ator;
		this.gênero = gênero;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getAtor() {
		return ator;
	}
	public void setAtor(String ator) {
		this.ator = ator;
	}
	public String getGênero() {
		return gênero;
	}
	public void setGênero(String gênero) {
		this.gênero = gênero;
	}

	@Override
	public String toString() {
		return "Filme [titulo: " + titulo + ", ano: " + ano + ", diretor: " + diretor + ", ator: " + ator + ", gênero: "
				+ gênero + "]";
	}
}