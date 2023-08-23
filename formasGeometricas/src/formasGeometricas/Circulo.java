package formasGeometricas;

public class Circulo extends Elipse {
	
	public Circulo(double eixoMaior, double eixoMenor) {
		super(eixoMaior, eixoMenor);
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
	
}
