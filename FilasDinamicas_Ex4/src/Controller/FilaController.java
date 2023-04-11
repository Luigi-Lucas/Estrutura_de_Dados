package Controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.filaobj.Fila;

public class FilaController {

	public FilaController() {

	}

	public void inserirFila(Fila fila, int senha) {
		fila.insert(senha);
	}

	public void inserirFilaPrioritarios(Fila filaPrioritarios, int senha) {
		filaPrioritarios.insert(senha);
	}

	public void removerElemento(Fila fila, Fila filaPrioritarios) {
		int opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Fila não Prioritarios \n2 - Fila Prioritarios"));
		switch (opc) {
		case 1:
			if (fila.isEmpty()) {
				System.err.println("Fila Vazia");
				break;
			}
			try {
				System.out.println("Senha para atendimento: " + fila.remove());
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 2:
			if (filaPrioritarios.isEmpty()) {
				System.err.println("Fila Vazia");
				break;
			}
			try {
				System.out.println("Senha para atendimento prioritario: " + filaPrioritarios.remove());
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
	}

	public void realizarChamado(Fila fila, Fila filaPrioritarios) {
		if (fila.isEmpty() && filaPrioritarios.isEmpty()) {
			System.err.println("Filas Vazias");
		}
		int i = 0;
		if (!filaPrioritarios.isEmpty()) {
			try {
				System.out.println("Senha para atendimento: " + fila.remove());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			while (i < 3) {
				try {
					System.out.println("Senha para atendimento prioritario: " + filaPrioritarios.remove());
				} catch (Exception e) {
					e.printStackTrace();
				}
				i++;
			}
		}
		if (filaPrioritarios.isEmpty()) {
			try {
				System.out.println("Senha para atendimento: " + fila.remove());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
