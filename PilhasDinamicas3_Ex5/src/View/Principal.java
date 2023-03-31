package View;

import javax.swing.JOptionPane;
import Controller.PalindromoController;
import br.edu.fateczl.pilhastring.Pilha;

public class Principal {

	public static void main(String[] args) {

		PalindromoController pC = new PalindromoController();

		Pilha p = new Pilha();

		String palavra = JOptionPane.showInputDialog("Digite a Palavra que deseja verificar");

		int j = 1;

		for (int i = 0; i < palavra.length(); i++) {
			p.push(palavra.substring(i, j));
			j++;
		}
		String inverso = pC.invertePalavra(p);

		if (pC.comparaPalavra(inverso, palavra)) {
			System.out.println("A palavra " + palavra + " e um Palindromo.");
		} else {
			System.out.println("A palavra " + palavra + " nao e um Palindromo.");
		}
	}
}
