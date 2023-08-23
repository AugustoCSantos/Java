package prova1;

public class Ladino extends Personagem {
	
	public Ladino(String nome, int vida, int mana, int experiencia) {
		super(nome, vida, mana, experiencia);
	} //construtor sendo herança da clase personagem
	
	public int magia() {
		return ((this.vidaTotal() + this.manaTotal())/2) + ((this.ataqueTotal() + this.defesaTotal())/2);
	} //metodo herdado da clase pai que é implementado nas filhas 
}
