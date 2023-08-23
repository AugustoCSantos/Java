package prova1;

public class Item {
	private int ataque;
	private int defesa;
	private int vida;
	private int mana;
	
	public Item(int ataque, int defesa, int vida, int mana) {
		this.ataque = ataque;
		this.defesa = defesa;
		this.mana = mana;
		this.vida = vida;
	} // construtor de itens

	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
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
	

}
