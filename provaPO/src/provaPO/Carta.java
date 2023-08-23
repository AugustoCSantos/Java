package provaPO;

public abstract class Carta implements Jogavel {
	protected final String nome; // nao pode ser mudado
	protected int custo;
	protected Tipo tipo;
	
	public Carta(String nome, int custo, Tipo tipo) {
		this.nome = nome;
		this.custo = custo;
		this.tipo = tipo;
	} //construtor de carta
	
	public void imprimir() {
		System.out.println("Nome: " + this.getNome() );
		System.out.println("Custo: " + this.getCusto() );
		System.out.println("Tipo: " + this.getCusto() );
	} // implementando a interface

	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}
	
	
}
