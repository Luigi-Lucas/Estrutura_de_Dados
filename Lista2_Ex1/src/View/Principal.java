package View;

import Controller.OrdenaController;
import br.edu.fateczl.listaint.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		OrdenaController oC = new OrdenaController();
		
		Lista l = new Lista();
		
		l.addFirst(6);
		l.addFirst(3);
		l.addFirst(7);
		l.addFirst(4);
		l.addFirst(2);
		l.addFirst(9);
		l.addFirst(1);
		l.addFirst(8);
		l.addFirst(5);
		l.addFirst(10);
		
		int[] vetor = new int [l.size()];
		
		oC.ordenaLista(l, vetor);
	}

}
