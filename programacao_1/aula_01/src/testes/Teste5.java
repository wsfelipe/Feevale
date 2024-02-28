package testes;

import javax.swing.JOptionPane;

public class Teste5 {
	public static void main(String[] args) {
		String num1s,num2s;
		int num1,num2;
		int soma;
		
		num1s = JOptionPane.showInputDialog(null, "Informe um número inteiro","Primeiro Número",JOptionPane.QUESTION_MESSAGE);
		num2s = JOptionPane.showInputDialog(null, "Informe outro número inteiro","Segundo Número",JOptionPane.QUESTION_MESSAGE);
		
		try {
			num1 = Integer.parseInt( num1s );
			num2 = Integer.parseInt( num2s );
			soma = num1+num2;
			
			JOptionPane.showMessageDialog(null, "Soma dos dois números informados: "+soma);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Insira números inteiros válidos");
		}
	}
}
