package provaPO;

public class Robo extends Criatura {
	private static int novo_robo = 0; //gerar robos para somar no up dos atributos
	
	public Robo(String nome, int custo, Tipo tipo, int ataque, int defesa) {
		super(nome, custo, tipo, ataque, defesa);
		novo_robo = novo_robo + 1;
	}
	
	public int getAtaque() {
		return this.ataque + novo_robo;
	} // up do ataque
	
	public int getDefesa() {
		return this.defesa + novo_robo;
	} // up da defesa
	
	public static int getNovo_robo() {
		return novo_robo;
	}
}
