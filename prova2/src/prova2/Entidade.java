package prova2;

import java.util.ArrayList;

public abstract class Entidade implements Lutavel{
	protected final String nome; //nao pode ser mudado
	protected int vida;
	protected int mana;
	protected ArrayList<Item> itens;
	
	public Entidade(String nome, int vida, int mana) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.itens = new ArrayList<Item>();
	} //construtor da entidade

	public abstract int poder(); //eh implementado nas clases filhas pois essa clase nao gera instancias
	
	public int ataqueTotal() {
		int atq = 0;
		for(Item item : itens) {
			atq = atq + item.getAtaque();
		}
		return atq;
	} // implementando o metodo da interface lutavel
	
	public int defesaTotal() {
		int def = 0;
		for(Item item : itens) {
			def = def + item.getDefesa();
		}
		return def;
	} // implementando o metodo da interface lutavel
	
	public int vidaTotal() {
		int vd = 0;
		for(Item item : itens) {
			vd = vd + item.getVida();
		}
		return vd;
	} // implementando o metodo da interface lutavel
	
	public int manaTotal() {
		int mn = 0;
		for(Item item : itens) {
			mn = mn + item.getMana();
		}
		return mn;
	} // implementando o metodo da interface lutavel
	
	
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

	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public String getNome() {
		return nome;
	}
	
	
}
