package prova2;

public class Guerreiro extends Entidade{
	
	public Guerreiro(String nome, int vida, int mana) {
		super(nome, vida, mana);
	}
	
	public int poder() {
		return this.ataqueTotal() * this.vidaTotal();
	} //metodo da clase pai que so eh implementado na clase filha

}
