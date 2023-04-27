package Controller;

import br.edu.fateczl.listaint.Lista;

public class ListasController {

	public ListasController() {
		super();
	}

	public void interseccao(Lista lA, Lista lB) throws Exception {

		Lista lI = new Lista();

		for (int i = 0; i < lA.size(); i++) {
			for (int j = 0; j < lB.size(); j++) {
				if (lA.get(i) == lB.get(j)) {
					lI.addFirst(lA.get(i));
				}
			}
		}

		System.out.print("Lista I: ");
		for (int i = 0; i < lI.size(); i++) {
			System.out.print(lI.get(i));
			System.out.print(" ");
		}
	}

	public void uniao(Lista lA, Lista lB) throws Exception {
		
		Lista lU = new Lista();
		
		for (int i = lA.size() - 1; i >= 0; i--) {
			lU.addFirst(lA.get(i));
		}
		
		for (int i = 0; i < lB.size(); i++) {
			lU.addLast(lB.get(i));
		}
		
		System.out.println();
		System.out.print("Lista U: ");
		for (int i = 0; i < lU.size(); i++) {
			System.out.print(lU.get(i));
			System.out.print(" ");
		}
	}
}
