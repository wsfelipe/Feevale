package testes;

import javax.swing.JOptionPane;

public class Teste5 {

	public static void main(String[] args) {
		
		String a;
		String b;
		int a_int;
		int b_int;
		int soma;
		
		a = JOptionPane.showInputDialog(null, "Informe a", "A", JOptionPane.QUESTION_MESSAGE);
		b = JOptionPane.showInputDialog(null, "Informe b", "B", JOptionPane.QUESTION_MESSAGE);
		
		a_int = Integer.parseInt( a );
		b_int = Integer.parseInt( b );
		soma = a_int+b_int; 
		
		JOptionPane.showMessageDialog(null, "A soma é: " + soma );

	}

}
