package provaPO;

public class Reptil extends Criatura{
	public Reptil(String nome, int custo, Tipo tipo, int ataque, int defesa) {
		super(nome, custo, tipo, ataque, defesa);
	}
	
	public int getAtaque() {
		return this.ataque + this.getCusto();
	} //calculando o up do ataque
	
	public int getDefesa() {
		return this.defesa + this.getCusto();
	} //calculando o up da defesa
}
