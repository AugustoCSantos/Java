package prova2;

public class Troll extends Entidade {
	
	public Troll(String nome, int vida, int mana) {
		super(nome, vida, mana);
	}
	
	public int poder() {
		return this.defesaTotal() * this.manaTotal();
	} // metodo da clase pai que so eh implementado na clase filha

}
