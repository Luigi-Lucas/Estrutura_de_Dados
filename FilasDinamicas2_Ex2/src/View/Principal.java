package View;

import javax.swing.JOptionPane;
import Controller.TelefoneController;
import br.edu.fateczl.filastrings.Fila;

public class Principal {

	public static void main(String[] args) throws Exception {

		TelefoneController tC = new TelefoneController();
		Fila f = new Fila();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1 - Inserir números. \n2 - Consultar chamadas perdidas. \n9 - Finalizar."));
			switch (opc) {
			case 1:
				String numeroTelefone = JOptionPane.showInputDialog(null, "Digite o número de Telefone");
				tC.insereLigacao(f, numeroTelefone);
				break;
			case 2:
				tC.consultaLigacoes(f);
				break;
			case 9:
				System.out.println("Sistema Finalizado.");
				System.exit(0);
			default:
				System.out.println("Opção Inválida");
			}
		}
	}
}
