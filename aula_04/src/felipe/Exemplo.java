package felipe;

import javax.swing.JOptionPane;

public class Exemplo {

	public static void main(String[] args) {
		
		String n[] = new String [4];
		int num[] = new int [4];
		
		for (int i=0;i<num.length;i++) {
			n[i] = JOptionPane.showInputDialog(null, "Informe n"+Math.addExact(i, 1)+": ");
			num[i] = Integer.parseInt(n[i]);
		}
		
		int maior = num[0];
		int menor = num[0];
		
		for (int i=0;i<n.length;i++) {
			if (num[i] > maior) {
				maior = num[i];
			}
			if (num[i] < menor) {
				menor = num[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "Maior numero: "+ maior);
		JOptionPane.showMessageDialog(null, "Menor numero: "+ menor);
	}

}
