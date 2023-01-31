package poker;

import java.util.Arrays;

public class Baraja {

	private Carta[]cartas;
	private int numeroCartas;



	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	public int getNumeroCartas() {
		return numeroCartas;
	}

	public void setNumeroCartas(int numeroCartas) {
		this.numeroCartas = numeroCartas;
	}


	public void generarBaraja() {
		
		cartas = new Carta[55];
		
		cartas[0]= new Carta("AC", true);
		cartas[1]= new Carta("2C", true);
		cartas[3]= new Carta("3C", true);
		cartas[4]= new Carta("4C", true);
		cartas[5]= new Carta("5C", true);
		cartas[6]= new Carta("6C", true);
		cartas[7]= new Carta("7C", true);
		cartas[8]= new Carta("8C", true);
		cartas[9]= new Carta("9C", true);
		cartas[10]= new Carta("10C", true);
		cartas[11]= new Carta("JC", true);
		cartas[12]= new Carta("QC", true);
		cartas[13]= new Carta("KC", true);
		cartas[14]= new Carta("AR", true);
		cartas[15]= new Carta("2R", true);
		cartas[16]= new Carta("3R", true);
		cartas[17]= new Carta("4R", true);
		cartas[18]= new Carta("5R", true);
		cartas[19]= new Carta("6R", true);
		cartas[20]= new Carta("7R", true);
		cartas[21]= new Carta("8R", true);
		cartas[22]= new Carta("9R", true);
		cartas[23]= new Carta("10R", true);
		cartas[24]= new Carta("JR", true);
		cartas[25]= new Carta("QR", true);
		cartas[26]= new Carta("KR", true);
		cartas[27]= new Carta("AT", true);
		cartas[28]= new Carta("2T", true);
		cartas[29]= new Carta("3T", true);
		cartas[30]= new Carta("4T", true);
		cartas[31]= new Carta("5T", true);
		cartas[32]= new Carta("6T", true);
		cartas[33]= new Carta("7T", true);
		cartas[34]= new Carta("8T", true);
		cartas[35]= new Carta("9T", true);
		cartas[36]= new Carta("10T", true);
		cartas[37]= new Carta("JT", true);
		cartas[38]= new Carta("QT", true);
		cartas[39]= new Carta("KT", true);
		cartas[40]= new Carta("AP", true);
		cartas[41]= new Carta("2P", true);
		cartas[42]= new Carta("3P", true);
		cartas[43]= new Carta("4P", true);
		cartas[44]= new Carta("5P", true);
		cartas[45]= new Carta("6P", true);
		cartas[46]= new Carta("7P", true);
		cartas[47]= new Carta("8P", true);
		cartas[48]= new Carta("9P", true);
		cartas[49]= new Carta("10P", true);
		cartas[50]= new Carta("JP", true);
		cartas[51]= new Carta("QP", true);
		cartas[52]= new Carta("KP", true);
		cartas[53]= new Carta("COMODIN", true);
		cartas[54]= new Carta("COMODIN", true);
		
		
	}

	@Override
	public String toString() {
		String devolver = "[";
		for(int i=0; i<cartas.length; i++) {
			devolver += cartas[i]+ ",";
			
		}
		devolver +="]";
		return devolver;
	}


	
	
}
