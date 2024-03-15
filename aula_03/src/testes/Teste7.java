package testes;

import javax.swing.JOptionPane;

import humanidade.Humano;

public class Teste7 {

	public static void main(String[] args) {
		
		Humano joao;
		Humano maria;
		
		joao = new Humano();
		maria = new Humano();
		
		joao.setNome( "Joao das Couve" );
		maria.setNome( "Maria dos abacates" );
		joao.setNaturalidade( "Brasileiro" );
		maria.setNaturalidade( "Argentina" );
		
		JOptionPane.showMessageDialog(null, maria.getNome());
		JOptionPane.showMessageDialog(null, maria.getNaturalidade());
		JOptionPane.showMessageDialog(null, joao.getNome());
		JOptionPane.showMessageDialog(null, joao.getNaturalidade());

	}

}
