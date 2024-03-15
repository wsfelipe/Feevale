package testes;

import javax.swing.JOptionPane;

public class Teste3 {

	public static void main(String[] args) {
		int a = 1000;
		
		/**
		 * O método showMessageDialog está sobrecarregado
		 * Isso se chama sobrecarga de métodos
		 */
		JOptionPane.showMessageDialog(null, a );
		JOptionPane.showMessageDialog(null, "variavel A", "Resposta", JOptionPane.INFORMATION_MESSAGE );		
		JOptionPane.showMessageDialog(null, "variavel A", "Resposta", JOptionPane.PLAIN_MESSAGE );		
		JOptionPane.showMessageDialog(null, "variavel A", "Resposta", JOptionPane.QUESTION_MESSAGE );		
		JOptionPane.showMessageDialog(null, "variavel A", "Resposta", JOptionPane.WARNING_MESSAGE );		
		JOptionPane.showMessageDialog(null, "variavel A", "Resposta", JOptionPane.ERROR_MESSAGE );		
	}

}
