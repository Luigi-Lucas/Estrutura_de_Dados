package View;

import javax.swing.JOptionPane;

import Controller.FatController;

public class Principal {

	public static void main(String[] args) {
		
		FatController fCont = new FatController();
		
		int valor = 0;
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		} while (valor > 10);
		
		System.out.println("Fatorial: " + fCont.fatorial(valor));
	}

}
