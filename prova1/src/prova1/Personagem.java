package prova1;

import java.util.ArrayList;

//abstract pois a clase nao gera instancias

public abstract class Personagem {
	protected final String nome; //o nome nao pode ser mudado
	protected int vida;
	protected int mana;
	protected int experiencia;
	protected ArrayList<Item> itens;
	
	public Personagem(String nome, int vida, int mana, int experiencia) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.experiencia = experiencia;
		this.itens = new ArrayList<Item>();
	} //construtor do personagem
	
	public abstract int magia(); // para ser implementada nas clases filhas 

	public ArrayList<Item> getItens(){
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getNome() {
		return nome;
	} //por nao poder ser mudado, nao se utiliza o set
	
	
	public int manaTotal(){
		int mana = this.getMana();
		for(Item item : this.itens) {
			mana = mana + item.getMana();
		}
		return mana;
	} //acumula a mana tanto do personagem quanto a dos seus itens 
	
	public int vidaTotal(){
		int vida = this.getVida();
		for(Item item : this.itens) {
			vida = vida + item.getVida();
		}
		return vida;
	} // acumula a vida do personagem e dos seus itens
	
	public int ataqueTotal(){
		int ataque = 0;
		for(Item item : this.itens) {
			ataque = ataque + item.getAtaque();
		}
		return ataque;
	} // acumula o ataque dos itens
	
	public int defesaTotal() {
		int defesa = 0;
		for(Item item : this.itens) {
			defesa = defesa + item.getDefesa();
		}
		return defesa;
	} // acumula a defesa dos itens
}
