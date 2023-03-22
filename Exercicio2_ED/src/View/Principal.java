package View;

import Controller.OperacoesController;

/*Criar uma função recursiva que receba o dividendo e o divisor de uma
  operação de divisão e, por subtrações, exiba o resto da divisão.*/

public class Principal {

	public static void main(String[] args) {

		OperacoesController C = new OperacoesController();

		double num = 13;
		double divisor = 5;
		System.out.println(C.divisao(num, divisor));
	}
}