package prova1;

public class Guerreiro extends Personagem{
	
	public Guerreiro(String nome, int vida, int mana, int experiencia) {
		super(nome, vida, mana, experiencia);
	} //construtor sendo herança da clase personagem
	
	public int magia() {
		return this.vidaTotal() * this.defesaTotal();
	} //metodo herdado da clase pai que é implementado nas filhas 

}
