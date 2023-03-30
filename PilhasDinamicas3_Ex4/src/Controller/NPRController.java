package Controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhaint.Pilha;

public class NPRController {

	public NPRController() {
		super();
	}

	public void insereValor(Pilha p, int valor) {
		p.push(valor);
	}

	public int npr(Pilha p, String op) throws Exception {
		int x = 0, y = 0, resultado = 0;
		if (p.size() < 2) {
			throw new Exception("Quantidade de valores na pilha insuficientes!");
		}
		switch (op) {
		case "+":
			try {
				x = p.pop();
				y = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			resultado = x + y;
			break;
		case "-":
			try {
				x = p.pop();
				y = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			resultado = y - x;
			break;
		case "*":
			try {
				x = p.pop();
				y = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			resultado = x * y;
			break;
		case "/":
			try {
				x = p.pop();
				y = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			resultado = y / x;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Operação Invalida!");
		}
		p.push(resultado);
		return resultado;
	}
}
