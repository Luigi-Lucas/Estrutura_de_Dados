package View;

import Controller.OperacoesController;
import br.edu.fateczl.listaint.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {

		OperacoesController oP = new OperacoesController();

		Lista lista = new Lista();

		lista.addFirst(8);
		lista.addFirst(7);
		lista.addFirst(6);
		lista.addFirst(2);
		lista.addFirst(1);

		System.out.print("Lista L: ");
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i));
			System.out.print(" ");
		}

		int[] vetor = { 2, 5, 9, 6, 4 };

		oP.op(lista, vetor);

	}
}
