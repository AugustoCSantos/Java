import java.util.ArrayList;

public class Aluno extends Pessoa {
	ArrayList<Double> notas = new ArrayList<Double>();
	
	
	private Nota[] notas;
	
	public Aluno(String nome, String cpf) {
		super(nome, cpf);
		this.notas = new nota;
	}
	
	public void addNota(double nota) {
		notas.add(nota);
	}
	
	public double getMedia() {
		double notaFinal = 0;
		for(Double nota: notas) {
			notaFinal += nota;
		}
		
	return notaFinal/2;
		
	}
	
	public static void main(String [] args) {
		Aluno Augusto = new Aluno("Augusto", "54215732");
		
		Augusto.addNota(9.0);
		Augusto.addNota(7.0);
		
		double notaFinal = Augusto.getMedia();
		System.out.println("Media: " + notaFinal);
	}

}
