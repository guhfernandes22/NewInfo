package etec;

import javax.swing.JOptionPane;

public class NewInfo {

	public static void main(String[] args) {
		int idade;
		String nome;
		
		nome = JOptionPane.showInputDialog("Bem Vindo Digite o nome do cliente");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente"));
		
		if (idade <60) {
			JOptionPane.showMessageDialog(null, "O Cliente " + nome + " deve ir para fila Comun!");
		} else {
		if (idade >= 60 && idade <= 79) {
			JOptionPane.showMessageDialog(null, "O Cliente " + nome + " deve ir para fila Prioritaria!");
		} else { 
		if (idade >= 80) {
			JOptionPane.showMessageDialog(null, "O Cliente " + nome + " deve ir para fila Prioritaria Especial");
		} else {
			JOptionPane.showMessageDialog(null, "Idade Inválida");
				}
			}
		}
	}
}
