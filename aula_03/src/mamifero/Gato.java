package mamifero;

public class Gato extends Mamifero {
	
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void mia() {
		System.out.println( this.getNomeAnimal()+ ": miau");
	}

}
