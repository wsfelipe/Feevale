package aula_02;

import javax.swing.JOptionPane;

public class Aluno {
	
	String nome;
	double media;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, double media) {
		this.nome = nome;
		this.media = media;
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	void exibeEstado() {
		JOptionPane.showMessageDialog(null, "Aviso", "media do aluno "+ nome +": "+ media, JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		a.exibeEstado();
		Aluno a1;
		a1 = new Aluno("Amanda");
		a1.exibeEstado();
		Aluno a2 = new Aluno("Alice dos passos Dias Aguiar", 9.5);
		a2.exibeEstado();
		a.nome = "Decio";
		a.media = 7.8;
		a.exibeEstado();
		a1.media = 9.1;
		a1.exibeEstado();		
		
	}

}
