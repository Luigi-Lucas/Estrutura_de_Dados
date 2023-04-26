package View;

import Controller.InverteController;
import br.edu.fateczl.listaint.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		InverteController iC = new InverteController();
		
		Lista l = new Lista();
		
		l.addFirst(3);
		l.addLast(5);
		l.addLast(18);
		l.addLast(12);
		l.addLast(9);
		l.addLast(7);
		l.addLast(6);
		l.addLast(2);
		l.addLast(13);
		l.addLast(4);
		l.addLast(16);

		iC.inverteLista(l);
	}
}
