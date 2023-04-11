package View;

import javax.swing.JOptionPane;
import Controller.ImpressoraController;
import br.edu.fateczl.filastrings.Fila;

public class Principal {

	public static void main(String[] args) throws Exception {

		ImpressoraController iC = new ImpressoraController();

		Fila f = new Fila();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1 - Inserir documentos. \n2 - Iniciar Impressão. \n9 - Finalizar."));
			switch (opc) {
			case 1:
				String documento = JOptionPane.showInputDialog("Digite o documento que deseja inserir");
				while (!documento.contains("ID_PC;")) {
					System.out.println("Formato Invalido");
					documento = JOptionPane.showInputDialog("Digite novamente o documento que deseja inserir");
				}
				iC.insereDocumento(f, documento);
				break;
			case 2:
				iC.imprime(f);
				break;
			case 9:
				System.out.println("Programa Finalizado");
				System.exit(0);
			default:
				System.out.println("Opcao Invalida");
			}
		}
	}
}
