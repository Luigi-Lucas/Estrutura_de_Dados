package View;

import javax.swing.JOptionPane;

import Controller.PlayerController;
import br.edu.fateczl.listastrings.Lista;

public class Principal {

	public static void main(String[] args) {

		PlayerController pC = new PlayerController();

		Lista lista = new Lista();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					" 1 - Inserir Música \n 2 - Remover Música \n 3 - Executar Playlist \n 9 - Finalizar"));
			switch (opc) {
			case 1:
				String nome = JOptionPane.showInputDialog("Digite o nome da Música");
				String nomeArtista = JOptionPane.showInputDialog("Digite o nome do Artista");
				String duracao = JOptionPane.showInputDialog("Digite a duração da Música em segundos");
				String musica = nome + ";" + nomeArtista + ";" + duracao;
				try {
					pC.adicionaMusica(lista, musica);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da música que deseja remover"));
				try {
					pC.removeMusica(lista, posicao);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					pC.executaPlaylist(lista);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 9:
				System.out.println("Programa finalizado.");
				System.exit(0);
			default:
				System.out.println("Opção inválida");
			}
		}

	}
}
