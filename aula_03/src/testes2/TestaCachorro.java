package testes2;

import mamifero.Cachorro;
import mamifero.CachorroDeMadame;

public class TestaCachorro {
	
	public static void main(String[] args) {
		Cachorro rex = new Cachorro();
		rex.setNomeAnimal("Rex");
		
		CachorroDeMadame laika = new CachorroDeMadame();
		laika.setNomeAnimal("Laika");
		
		rex.fazXixi();
		rex.late();
		laika.fazXixi();
		laika.late();
	}

}
