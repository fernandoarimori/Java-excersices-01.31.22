package cracteclasses;

public class Cliente {
	//atributos
	String sexo;
	int idade;
	double altura, peso;
	boolean feliz;
	
	//metodos
	public void humor()
	{
		this.feliz=true;
	}
	
	public void maiordeidade()
	{
		if(this.idade>=18)
			System.out.println("Voc? ? maior de idade");
		else
			System.out.println("Voc? ? menos de idade");
	}
	
	public void status() {
		System.out.println("O sexo da pessoa ? " +this.sexo);
		System.out.println("A idade da pessoa ? de: " +this.idade);
		System.out.println("A alta e peso s?o respectivamente: "+ this.altura+ " e "+ this.peso+".");
	}
	
	
	
	

}
