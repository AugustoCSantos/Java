package provaPO;

public abstract class Criatura extends Carta{
	protected int ataque;
	protected int defesa;
	
	public Criatura(String nome, int custo, Tipo tipo, int ataque, int defesa) {
		super(nome, custo, tipo);
		this.ataque = ataque;
		this.defesa = defesa;
	} //construtor de criatura herdando as caracteristicas da clase Carta
	
	public void imprimir() {
		super.imprimir(); // chamando a impressao dos atributos da carta
		System.out.println("Ataque: " + this.getAtaque());
		System.out.println("Defesa: " + this.getDefesa());
	} //imprimindo os novos atributos junto

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
	
	
}
