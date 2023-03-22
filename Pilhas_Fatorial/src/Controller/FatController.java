package Controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {

	public FatController() {
		super();
	}

	public int fatorial(int valor) {
		Pilha p = new Pilha();
		int v1 = 0, v2 = 0, mult = 1;

		for (int i = 1; i <= valor; i++) {
			p.push(i);
		}
		
		int tamanho = p.size();
		
		while (tamanho > 1) {
			try {
				v1 = p.pop();
				v2 = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			mult = v1 * v2;
			p.push(mult);
			tamanho --;
		}
		return mult;
	}
}
