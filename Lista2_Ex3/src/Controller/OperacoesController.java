package Controller;

import br.edu.fateczl.listaint.Lista;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	public void op(Lista lista, int[] vetor) throws Exception {

		for (int valor : vetor) {
			for (int i = 0; i < lista.size(); i++) {
				if (valor == lista.get(i)) {
					lista.addLast(valor);
					break;
				}
			}
			if (valor % 2 == 0) {
				lista.add(valor, 2);
			} else if (valor % 2 == 1) {
				lista.add(valor, 1);
			}
		}
		
		System.out.println();
		System.out.print("Lista L: ");
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i));
			System.out.print(" ");
		}
		
	}
}
