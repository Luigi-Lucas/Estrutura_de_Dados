package Controller;

import br.edu.fateczl.pilhaint.Pilha;

public class ConverteController {

	public ConverteController() {
		super();
	}

	Pilha p = new Pilha();

	public String decToBin(int decimal) {
		
		int x = 0;
		String binario = "";
		
		while (decimal >= 1) {
			
			int resto = decimal % 2;
			
			decimal = decimal / 2;
			
			p.push(resto);
		}
		
		for (int i = p.size(); i >= 1; i--) {
			try {
				x = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			String numero = String.valueOf(x);
			binario = binario + numero;
		}
		return binario;
	}
}
