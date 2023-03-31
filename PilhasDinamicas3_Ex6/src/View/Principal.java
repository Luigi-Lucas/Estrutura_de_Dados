package View;

import javax.swing.JOptionPane;
import Controller.HistoricoController;
import br.edu.fateczl.pilhastring.Pilha;

public class Principal {

	public static void main(String[] args) {

		HistoricoController hC = new HistoricoController();

		Pilha Historico = new Pilha();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Inserir novo endereco \n2 - Remover o ultimo endereco \n3 - Consultar o ultimo endereco \n9 - Finalizar Programa"));
			switch (opc) {
			case 1:
				hC.inserirEndereco(Historico);
				break;
			case 2:
				hC.removerEndereco(Historico);
				break;
			case 3:
				hC.consultarEndereco(Historico);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Programa finalizado.");
				System.exit(0);
			}
		}
	}
}
