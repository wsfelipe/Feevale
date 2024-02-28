package testes;

import javax.swing.JOptionPane;

public class Teste6 {

	public static void main(String[] args) {
		String num1s,num2s;
		int num1,num2, maior=0, menor=0;
		boolean iguais;
		
		num1s = JOptionPane.showInputDialog(null, "Informe um número inteiro","Primeiro Número",JOptionPane.QUESTION_MESSAGE);
		num2s = JOptionPane.showInputDialog(null, "Informe outro número inteiro","Segundo Número",JOptionPane.QUESTION_MESSAGE);
		
		try {
			num1 = Integer.parseInt( num1s );
			num2 = Integer.parseInt( num2s );
			
			iguais = false;
			
			if(num1>num2) {
				maior = num1;
				menor = num2;
			}else if(num2>num1){
				maior = num2;
				menor = num1;
			} else {
				iguais = true;
			}
			
			if(iguais) {				
				JOptionPane.showMessageDialog(null,"Os números possuem o mesmo valor");
			} else {				
				JOptionPane.showMessageDialog(null,maior+" é maior que "+menor);
			}
			
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Insira números inteiros válidos");
		}
	}

}
