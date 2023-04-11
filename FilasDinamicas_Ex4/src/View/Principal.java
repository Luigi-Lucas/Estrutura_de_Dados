package View;

import javax.swing.JOptionPane;
import Controller.FilaController;
import br.edu.fateczl.filaobj.Fila;

public class Principal {

	public static void main(String[] args) {

		FilaController fC = new FilaController();

		Fila fila = new Fila();
		Fila filaPrioritarios = new Fila();

		int senha = 1, senhaPrioritarios = 1;

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1 - Inserir uma nova senha na fila de não prioritários. \n2 - Inserir uma nova senha na fila de prioritários. \n3 - Remover o primeiro elemento da fila \n4 - Realizar o chamado. \n9 - Finalizar."));
			switch (opc) {
			case 1:
				fC.inserirFila(fila, senha);
				senha++;
				break;
			case 2:
				fC.inserirFilaPrioritarios(filaPrioritarios, senhaPrioritarios);
				senhaPrioritarios++;
				break;
			case 3:
				fC.removerElemento(fila, filaPrioritarios);
				break;
			case 4:
				fC.realizarChamado(fila, filaPrioritarios);
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
