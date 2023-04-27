package Controller;

import br.edu.fateczl.calc.Ordenacao;
import br.edu.fateczl.listaint.Lista;

public class OrdenaController {

	public OrdenaController() {
		super();
	}
	
	public void ordenaLista(Lista l, int[] vetor) throws Exception {
		
		Ordenacao ord = new Ordenacao();
		
		System.out.print("Lista: ");
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i));
			System.out.print(" ");
		}
		
		for (int i = 0; i < l.size(); i++) {
			vetor[i] = l.get(i);
		}
		
		ord.quickSort(vetor, 0, vetor.length - 1);
	    
		int cont = 0;
		for (int valor : vetor) {
			l.remove(cont);
			l.add(valor, cont);
			cont++;
		}
		
		System.out.println();
		System.out.print("Lista Ordenada: ");
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i));
			System.out.print(" ");
		}
	}
}
