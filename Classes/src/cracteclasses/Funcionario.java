package cracteclasses;

public class Funcionario {
	String nome;
	int idade, regs, tempo;
	
	public void status(){
		System.out.print("O nome do funcion?rio ? "+this.nome+" com idade de "+this.idade+" anos, de registro "+this.regs+" "
				+ "est? trabalhando h? "+this.tempo+" anos.");
	}
	
}
