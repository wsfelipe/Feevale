package mamifero;

import animal.Animal;

public abstract class Mamifero extends Animal {
	
	private int numeroMamas;

	public int getNumeroMamas() {
		return numeroMamas;
	}

	public void setNumeroMamas(int numeroMamas) {
		this.numeroMamas = numeroMamas;
	}
	
	public void amamenta() {
		System.out.println( "amamentou o filhote");
	}

}
