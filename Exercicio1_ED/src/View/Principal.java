package View;

import Controller.OperacoesController;

/*Criar uma função recursiva que receba 2 valores A e B e, por somas,
  apresente o resultado da multiplicação de A por B.*/

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController C = new OperacoesController();
		
		int A = 3;
		int B = 5;
		System.out.println(C.mult(A, B));

	}
}
