package mamifero;

public class CachorroDeMadame extends Cachorro{
	private int licenca;

	public int getLicenca() {
		return licenca;
	}

	public void setLicenca(int licenca) {
		this.licenca = licenca;
	}
	
	public void fazXixi() {
		System.out.println(this.getNomeAnimal() + "faz xixi no tapedinho perfumado");
	}
}
