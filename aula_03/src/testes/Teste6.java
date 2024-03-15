package testes;

import javax.swing.JOptionPane;

public class Teste6 {

	public static void main(String[] args) {
		String a;
		String b;
		int a_int;
		int b_int;
		int maior;
		
		a = JOptionPane.showInputDialog(null, "Informe a", "A", JOptionPane.QUESTION_MESSAGE);
		b = JOptionPane.showInputDialog(null, "Informe b", "B", JOptionPane.QUESTION_MESSAGE);
		
		a_int = Integer.parseInt( a );
		b_int = Integer.parseInt( b );
		
		if ( a_int > b_int ) {
			JOptionPane.showMessageDialog(null, "A maior é: " + a_int );
		} else if ( b_int > a_int ) {
			JOptionPane.showMessageDialog(null, "A maior é: " + b_int );
		} else {
			JOptionPane.showMessageDialog(null, "As duas são iguais: " + b_int );
		}
		
		

	}

}
