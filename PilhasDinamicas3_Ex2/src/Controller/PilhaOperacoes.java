package Controller;

import br.edu.fateczl.pilhaint.Pilha;

public class PilhaOperacoes {

	public PilhaOperacoes() {
		super();
	}
	
	Pilha p = new Pilha();
	
	public void operacoes(int valor) {	
		int x = 0, y = 0;
		
		if (valor >= 0) {
			p.push(valor);
		} else {
			try {
				x = p.pop();
				y = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			int soma = x + y;
			p.push(valor);
			p.push(soma);		
		}
	}
	
	public void quantidade() {
		System.out.println("Quantidade de valores presentes na Pilha: " + p.size());
	}
}
