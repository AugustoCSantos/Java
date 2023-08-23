package prova1;

public class Fase {
	private final String nome;
	private Tema tema; //tem relacao com o enum Tema
	
	public Fase(String nome, Tema tema) {
		this.nome = nome;
		this.tema = tema;
	} //construtor de fase

	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public String getNome() {
		return nome;
	}
	
	

}
