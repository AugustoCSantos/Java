package formasGeometricas;

import java.util.Random;
import java.util.ArrayList;

public class TestaFormas {
	public static ArrayList<Formas> createShapes (int size){
		ArrayList<Formas> listaDeFormas = new ArrayList<Formas>();
		
		Random rand = new Random();
		
		for(int i=0 ; i<size; i++) {
			int forma = rand.nextInt(4);
			
			switch(forma) {
			case 0: //Elipse
				listaDeFormas.add(new Elipse(rand.nextDouble(10.0), rand.nextDouble(10.0)));
				break;
				
			case 1://Circulo
				Double raio = rand.nextDouble(10.0);
				listaDeFormas.add(new Circulo(raio, raio));
				break;
				
			case 2: //Retangulo
				listaDeFormas.add(new Retangulo(rand.nextDouble(10.0),rand.nextDouble(10.0)));
				break;
				
			case 3://Quadradinho
				Double length = rand.nextDouble(10.0);
				listaDeFormas.add(new Quadradinho(length, length));
				break;
			}
		}
		
		return listaDeFormas;
	}

}	