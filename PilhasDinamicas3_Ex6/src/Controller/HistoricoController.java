package Controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhastring.Pilha;

public class HistoricoController {

	public HistoricoController() {
		super();
	}

	public void inserirEndereco(Pilha Historico) {
		String endereco = JOptionPane.showInputDialog("Digite o endereco do site que deseja inserir");
		while (!endereco.substring(0, 11).contains("https://www")) {
			System.err.println("Endereco invalido!");
			endereco = JOptionPane.showInputDialog("Digite o endereco do site que deseja inserir");
		}
		Historico.push(endereco);
	}

	public void removerEndereco(Pilha Historico) {
		if (Historico.isEmpty()) {
			System.err.println("Pilha Vazia");
		} else {
			try {
				Historico.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void consultarEndereco(Pilha Historico) {
		if (Historico.isEmpty()) {
			System.err.println("Pilha Vazia");
		} else {
			try {
				System.out.println("Ultimo endereco visitado: " + Historico.top());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
