package Controller;

import br.edu.fateczl.listaint.Lista;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	public void maiorValor(Lista lista) throws Exception {
		int primeiroValor = 0;
		int segundoValor = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > primeiroValor) {
				primeiroValor = lista.get(i);
			}
		}
		for (int i = 0; i < lista.size(); i++) {
			if (primeiroValor != lista.get(i)) {
				if (lista.get(i) > segundoValor) {
					segundoValor = lista.get(i);
				}
			}
		}
		System.out.println();
		System.out.println("Primeiro Maior Valor: " + primeiroValor + "\nSegundo Maior Valor: " + segundoValor);
	}
}
