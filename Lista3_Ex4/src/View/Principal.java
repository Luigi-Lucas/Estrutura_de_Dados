package View;

import Controller.OperacoesController;
import br.edu.fateczl.listaint.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {

		OperacoesController oP = new OperacoesController();

		Lista lista = new Lista();

		lista.addFirst(3);
		lista.addLast(5);
		lista.addLast(8);
		lista.addLast(12);
		lista.addLast(9);
		lista.addLast(7);
		lista.addLast(6);
		lista.addLast(2);
		lista.addLast(3);
		lista.addLast(7);
		lista.addLast(16);

		System.out.print("Lista: ");
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i));
			System.out.print(" ");
		}
		oP.maiorValor(lista);
	}
}
