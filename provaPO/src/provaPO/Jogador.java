package provaPO;

import java.util.ArrayList;

public class Jogador {
	private final String nome;
	private int vida;
	private int armadura;
	private ArrayList<Jogavel> jogaveis;
	
	public Jogador(String nome, int vida, int armadura) {
		this.nome = nome;
		this.vida = vida;
		this.armadura = armadura;
		this.jogaveis = new ArrayList<Jogavel>();
	}//construtor de jogador

	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getArmadura() {
		return armadura;
	}
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public ArrayList<Jogavel> getJogaveis() {
		return jogaveis;
	}
	public void setJogaveis(ArrayList<Jogavel> jogaveis) {
		this.jogaveis = jogaveis;
	}

	public String getNome() {
		return nome;
	}
	
	
}
