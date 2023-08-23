package formasGeometricas;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteDownCasting {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Formas> forma = new ArrayList<>();
		
		System.out.println("Lista tamanho : ");
		int n = sc.nextInt();
		
		forma = TestaFormas.createShapes(n);
		
		for(Formas formas : forma) {
			System.out.println(forma.toString());
		}
		
		sc.close();
	}
}
