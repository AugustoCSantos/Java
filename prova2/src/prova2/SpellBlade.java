package prova2;

public class SpellBlade extends Guerreiro{
	
	public SpellBlade(String nome, int vida, int mana) {
		super(nome, vida, mana);
	}
	
	public int poder() {
		return this.ataqueTotal() * (this.vidaTotal() + this.manaTotal());
	} //metodo da clase pai que so eh implementado na clase filha
}
