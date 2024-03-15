package testes;

import javax.swing.JOptionPane;

public class Teste4 {

	public static void main(String[] args) {
		
		String idade;
		int idadeint;
		int proximaIdade;
		
		idade = JOptionPane.showInputDialog(null, "Informe tua idade", "Idade", JOptionPane.QUESTION_MESSAGE);
		
		idadeint = Integer.parseInt( idade );
		proximaIdade = idadeint+1; 
		
		JOptionPane.showMessageDialog(null, "tua proxima idade será: " + proximaIdade );

	}

}
