package testes2;

import animal.Animal;
import humanidade.Humano;
import mamifero.Cachorro;
import mamifero.Mamifero;

public class TestaHumano {

	public static void main(String[] args) {
		
		Humano homem = new Humano();
		Humano mulher = new Humano();
		
		homem.setNome( "Josefo Gil Aquino Esteves" );
		mulher.setNome( "Maria das Dores da Costa" );
		mulher.setNome( "Ester Elisa O. Pires" );
		homem.setNome( "Botelho Pontes Prudente Souto" );
		System.out.println(homem.getNome());
		System.out.println(mulher.getNome() );
		mulher.amamenta();
		homem.come();
		
		Cachorro a = new Cachorro();
		a.come();
	}

}
