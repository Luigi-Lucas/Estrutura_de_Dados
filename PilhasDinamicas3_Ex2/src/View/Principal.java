package View;

import Controller.PilhaOperacoes;

public class Principal {

	public static void main(String[] args) {
		
		PilhaOperacoes PilhaOp = new PilhaOperacoes();

		int[] vetor = { 0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5 };
		
		for (int valor : vetor) {
			PilhaOp.operacoes(valor);
		}
		PilhaOp.quantidade();
	}
}
