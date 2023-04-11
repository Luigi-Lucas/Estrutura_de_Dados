package Controller;

import br.edu.fateczl.filastrings.Fila;

public class TelefoneController {

	public TelefoneController() {
		super();
	}
	
	public void insereLigacao(Fila f, String numeroTelefone) {
		f.insert(numeroTelefone);
	}
	
	public void consultaLigacoes(Fila f) throws Exception {
		if (f.isEmpty()) {
			throw new Exception("Nao ha ligacoes.");
		}
		try {
			System.out.println("Ligacao realizada: " + f.remove());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
