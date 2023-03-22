package View;

import Controller.OperacoesController;

/*Construir uma função recursiva que receba um vetor e seu tamanho
  e apresente a quantidade de números pares existentes no vetor.
  Considere que a entrada deve ser, apenas de números naturais
  diferentes de zero. */

public class Principal {

	public static void main(String[] args) {

		OperacoesController C = new OperacoesController();

		int[] VT = { 1, 2, 3, 4, 5, 6, 8 };

		int length = VT.length;

		System.out.println(C.par(VT, length - 1));
	}
}
