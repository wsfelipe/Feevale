package humanidade;

import mamifero.Mamifero;

public class Humano extends Mamifero {
	
	private String nome;
	private String naturalidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		setNomeAnimal( nome );
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	


}
