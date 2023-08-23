package prova2;

public class TrollPOO extends Entidade {
	
	public TrollPOO(String nome, int vida, int mana) {
		super(nome, vida, mana);
	}
	
	public int poder(Lutavel lop) {
		return lop.vidaTotal() - 1;
	} //metodo da clase pai que so eh implementado na clase filha
}
