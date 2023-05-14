package View;

import javax.swing.JOptionPane;
import Controller.ApartamentoController;
import Model.Morador;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		ApartamentoController aC = new ApartamentoController();
		
		int pos = 0;
		while (pos != 9) {
			pos = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Morador \n2 - Consultar Morador \n3 - Excluir Morador \n4 - Listar Moradores \n9 - Finalizar"));
			switch(pos) {
			case 1: 
				Morador m = new Morador();
				m.nome = JOptionPane.showInputDialog("Digite o nome do Morador:");
				m.numeroApto = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Apartamento:"));
				m.modeloCarro = JOptionPane.showInputDialog("Digite o modelo do Carro:");
				m.corCarro = JOptionPane.showInputDialog("Digite a Cor do Carro:");
				m.placaCarro = JOptionPane.showInputDialog("Digite a Placa do Carro:");
				aC.cadastrarMorador(m);
				break;
			case 2:
				Morador mx = new Morador();
				mx.numeroApto = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Apartamento:"));
				aC.consultarMorador(mx);
				break;
			case 3:
				Morador my = new Morador();
				my.numeroApto = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Apartamento:"));
				aC.excluirMorador(my);
				break;
			case 4:
				int andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do andar que deseja Listar:"));
				aC.listarMoradores(andar);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Programa Finalizado.");
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");	
			}
		}
	}
}
