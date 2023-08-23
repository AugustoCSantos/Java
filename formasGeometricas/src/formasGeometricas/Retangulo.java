package formasGeometricas;

public class Retangulo extends Formas {
	protected double largura;
	protected double comprimento;
	
	public Retangulo(double largura, double comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double area() {
		return this.comprimento * this.largura;
	}
	
	public double perimetro() {
		return (this.comprimento + this.largura) * 2;
	}
	
	public String toString() {
		return "Largura: " + this.getLargura() + "\n" + 
				   "Comprimento: " + this.getComprimento() + "\n" +
				   "Area: " + this.area() + "\n" +
				   "Perimetro: " + this.perimetro() + "\n";
	}
}
