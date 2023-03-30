package View;

import javax.swing.JOptionPane;
import Controller.NPRController;
import br.edu.fateczl.pilhaint.Pilha;

public class Principal {

	public static void main(String[] args) throws Exception {

		NPRController NPR = new NPRController();

		Pilha p = new Pilha();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog("1 - Inserir valor na Pilha \n2 - Realizar Operação \n9 - Finalizar Programa"));
			switch (opc) {
			case 1:
				int valor = Integer
						.parseInt(JOptionPane.showInputDialog("Digite o número que deseja inserir na pilha"));
				NPR.insereValor(p, valor);
				break;
			case 2:
				String op = JOptionPane.showInputDialog("Digite a operacao que deseja fazer");
				System.out.println("Resultado: " + NPR.npr(p, op));
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Programa finalizado.");
				System.exit(0);
			}
		}
	}
}
