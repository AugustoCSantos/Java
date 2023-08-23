package formasGeometricas;

public class Elipse extends Formas implements Excentricidade {
	
	protected double eixoMaior;
	protected double eixoMenor;
	
	public Elipse(double eixoMaior, double eixoMenor) {
		this.eixoMaior = eixoMaior;
		this.eixoMenor = eixoMenor;
	}

	public double getEixoMaior() {
		return eixoMaior;
	}
	public void setEixoMaior(double eixoMaior) {
		this.eixoMaior = eixoMaior;
	}

	public double getEixoMenor() {
		return eixoMenor;
	}
	public void setEixoMenor(double eixoMenor) {
		this.eixoMenor = eixoMenor;
	}
	
	public double area() {
		return Math.PI * this.eixoMaior * this.eixoMenor;
	}

	public double perimetro() {
		return Math.PI*Math.sqrt(2*(Math.pow(this.eixoMaior, 2) + Math.pow(this.eixoMenor, 2)) - (Math.pow((this.eixoMaior - this.eixoMenor), 2))/2);
	}
	
	public double calcExcent() {
		this.medida();
		return Math.sqrt(1.0 - Math.pow(this.eixoMenor, 2) / Math.pow(this.eixoMaior, 2));
	}
	
	public void medida() {
		if(this.eixoMaior < this.eixoMenor) {
			double auxiliar = this.eixoMaior;
			this.eixoMaior = this.eixoMenor;
			this.eixoMenor = auxiliar;
		}
	}
	
	public String toString() {
		return "Eixo Maior: " + this.getEixoMaior() + "\n" +
				   "Eixo Menor: " + this.getEixoMenor() + "\n" +
				   "Area: " + this.area() + "\n" + 
				   "Perimetro: " + this.perimetro() + "\n" +
				   "Excentricidade: " + this.calcExcent() + "\n";
	}
	
}
