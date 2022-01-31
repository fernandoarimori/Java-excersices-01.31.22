package cracteclasses;

public class Aviao {

	String marca, local, destino;
	double peso;
	int pas;
	
	
	
	public void status() {
		System.out.println("A marca do seu avião é: "+ this.marca);
		System.out.println("O peso do seu avião é: "+ this.peso);
		System.out.println("O local de partida é: " + this.local);
		System.out.println("O local de destino é: " + this.destino);
		System.out.println("O total de passageiros e: " + this.pas);
	}
	
}
