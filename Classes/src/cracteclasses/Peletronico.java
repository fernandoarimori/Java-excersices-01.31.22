package cracteclasses;

public class Peletronico {
	String marca, objeto, sis;
	int lancamento, modelo, memoria;

	
	public Peletronico() {
		this.objeto= ("Celular");
	}
	
	
	public void status() {
		System.out.println("O "+this.objeto+" tem o sistema" + sis+" da marca "+ 
	this.marca+ "com memoria "+memoria+"GB, modelo "+modelo+" e foi lan?ado no ano de "+this.lancamento+ ".");
		System.out.println("Seu sistema operacional ?: "+sis+".");
	}

}
