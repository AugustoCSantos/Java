package provaPO;

public class Humano extends Criatura {
	public Humano(String nome, int custo, Tipo tipo, int ataque, int defesa) {
		super(nome, custo, tipo, ataque, defesa);
	}
	
	public int getAtaque() {
		if(this.getTipo() == tipo.DOURADA) {
			return this.ataque * 4;
		}
		else {
			return this.ataque;
		}
	} //calculando o up do atributo ataque
	
	public int getDefesa() {
		if(this.getTipo() == tipo.DOURADA) {
			return this.defesa * 4;
		}
		else {
			return this.defesa;
		}
	} //calculando o up do atributo defesa
}
