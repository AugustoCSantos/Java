package prova1;

public class Mago extends Personagem{
	
	public Mago(String nome, int vida, int mana, int experiencia) {
		super(nome, vida, mana, experiencia);
	} //construtor sendo herança da clase personagem
	
	public int magia() {
		return this.manaTotal() * this.ataqueTotal();
	} //metodo herdado da clase pai que é implementado nas filhas 

}
