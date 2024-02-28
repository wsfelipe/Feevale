package testes;

import javax.swing.JOptionPane;

import humanidade.Humano;

public class Teste7 {

	public static void main(String[] args) {

		Humano joao;
		Humano maria;
		
		joao = new Humano();
		maria = new Humano();
		
		joao.nome = "João das Couves";
		maria.nome = "Maria dos Abacates";

		joao.naturalidade = "Brasileiro";
		maria.naturalidade = "Britânico";
		
		JOptionPane.showMessageDialog(null, "Nome: "+ joao.nome +"\nNaturalidade: "+joao.naturalidade);
		JOptionPane.showMessageDialog(null, "Nome: "+ maria.nome +"\nNaturalidade: "+maria.naturalidade);
	}

}
