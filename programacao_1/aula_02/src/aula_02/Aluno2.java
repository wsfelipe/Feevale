package aula_02;

import javax.swing.JOptionPane;

public class Aluno2 {
	
	String nome;
	double media;
	
	public Aluno2() {
		
	}
	
	public Aluno2(String nome, double media) {
		this.nome = nome;
		this.media = media;
	}
	
	public Aluno2(String nome) {
		this.nome = nome;
	}
	
	void exibeEstado() {
		System.out.println("media do aluno "+ nome +": "+ media);			
	}

	public static void main(String[] args) {
		
		Aluno2 a = new Aluno2();
		a.exibeEstado();
		Aluno2 a1;
		a1 = new Aluno2("Amanda");
		a1.exibeEstado();
		Aluno2 a2 = new Aluno2("Alice dos passos Dias Aguiar", 9.5);
		a2.exibeEstado();
		a.nome = "Decio";
		a.media = 7.8;
		a.exibeEstado();
		a1.media = 9.1;
		a1.exibeEstado();	
		
	}

}
