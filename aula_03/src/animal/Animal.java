package animal;

public abstract class Animal {
	
	private String nomeAnimal = "Animal generico";
	private float comprimento;
	private float peso;
	
	public Animal() {
		
	}

	public Animal( String nome ) {
		this.nomeAnimal = nome;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void come() {
		System.out.println( nomeAnimal + " comeu" );
	}

}
