package mamifero;

public class Cachorro extends Mamifero {
	
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void fazXixi() {
		System.out.println( this.getNomeAnimal() + "fez xixi no poste");
	}
	public void late() {
		System.out.println( this.getNomeAnimal()+ ": au au");
	}

}
