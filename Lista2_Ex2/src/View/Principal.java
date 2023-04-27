package View;

import Controller.ListasController;
import br.edu.fateczl.listaint.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		ListasController lC = new ListasController();
		
		Lista lA = new Lista();
		Lista lB = new Lista();
		
		lA.addFirst(16);
		lA.addFirst(7);
		lA.addFirst(9);
		lA.addFirst(12);
		lA.addFirst(8);
		lA.addFirst(5);
		lA.addFirst(3);
		
		lB.addFirst(7);
		lB.addFirst(3);
		lB.addFirst(2);
		lB.addFirst(6);
		lB.addFirst(9);
		
		lC.interseccao(lA, lB);
		lC.uniao(lA, lB);
	}
}
