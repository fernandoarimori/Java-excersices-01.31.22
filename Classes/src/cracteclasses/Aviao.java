package cracteclasses;

public class Aviao {

	String marca, local, destino;
	double peso;
	int pas;
	
	
	
	public void status() {
		System.out.println("A marca do seu avi�o �: "+ this.marca);
		System.out.println("O peso do seu avi�o �: "+ this.peso);
		System.out.println("O local de partida �: " + this.local);
		System.out.println("O local de destino �: " + this.destino);
		System.out.println("O total de passageiros e: " + this.pas);
	}
	
}
