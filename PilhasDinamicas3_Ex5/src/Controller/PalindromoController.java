package Controller;

import br.edu.fateczl.pilhastring.Pilha;

public class PalindromoController {

	public PalindromoController() {
		super();
	}

	public String invertePalavra(Pilha p) {
		String inverso = "";
		while (!p.isEmpty()) {
			try {
				String x = p.pop();
				inverso += x;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return inverso;
	}

	public Boolean comparaPalavra(String inverso, String palavra) {
		if (inverso.equals(palavra)) {
			return true;
		} else {
			return false;
		}
	}
}
