package View;

import javax.swing.JOptionPane;

import Controller.ConverteController;

public class Principal {

	public static void main(String[] args) {

		ConverteController cCont = new ConverteController();

		int decimal = 0;

		do {
			decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite um número decimal limitado a 1000"));
		} while (decimal > 1000);

		System.out.println("Binario: " + cCont.decToBin(decimal));
	}
}
