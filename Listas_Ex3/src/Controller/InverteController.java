package Controller;

import br.edu.fateczl.listaint.Lista;

public class InverteController {

	public InverteController() {
		super();
	}

	public void inverteLista(Lista l) throws Exception {

		System.out.print("Lista: ");
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i));
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.print("Lista Invertida: ");
		
		for (int i = l.size() - 1; i >= 0; i--) {
			System.out.print(l.get(i));
			System.out.print(" ");
		}
	}
}
