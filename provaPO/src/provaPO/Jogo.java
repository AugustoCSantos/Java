package provaPO;

import java.util.ArrayList;

public class Jogo {
	private final String nome;
	private ArrayList<Jogador> jogadores;
	
	public Jogo(String nome) {
		this.nome = nome;
		this.jogadores = new ArrayList<Jogador>();
	}//construtor de jogo

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public String getNome() {
		return nome;
	}
	
	
}
