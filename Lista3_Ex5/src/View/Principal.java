package View;

import javax.swing.JOptionPane;

import Controller.ModificacaoCadastroController;

public class Principal {

	public static void main(String[] args) {

		ModificacaoCadastroController mC = new ModificacaoCadastroController();

		int idadeMin = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade Minima"));
		int idadeMax = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade Maxima"));
		double limiteCredito = Double.parseDouble(JOptionPane.showInputDialog("Digite o Limite de Credito"));

		try {
			mC.novoCadastro(idadeMin, idadeMax, limiteCredito);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
