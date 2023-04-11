package Controller;

import br.edu.fateczl.filastrings.Fila;

public class ImpressoraController {

	public ImpressoraController() {
		super();
	}
	
	public void insereDocumento(Fila f, String documento) {
		f.insert(documento);
	}
	
	public void imprime(Fila f) throws Exception {
		if (f.isEmpty()) {
			throw new Exception ("Fila Vazia");
		}
		while (!f.isEmpty()) {
			try {
				System.out.println("Imprimindo: [#PC: ID_PC – Arquivo: " + f.remove() + "]");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep((int)((Math.random() * 1001) + 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
