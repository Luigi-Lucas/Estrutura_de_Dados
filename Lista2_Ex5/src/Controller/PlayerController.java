package Controller;

import javax.swing.JOptionPane;
import Model.Musica;
import br.edu.fateczl.listastrings.Lista;

public class PlayerController {

	public PlayerController() {
		super();
	}

	public void adicionaMusica(Lista lista, String musica) throws Exception {
		String[] info = musica.split(";");
		Musica m = new Musica();
		m.nome = info[0];
		m.nomeArtista = info[1];
		m.duracao = info[2];
		if (lista.isEmpty()) {
			lista.addFirst(m.nome + ";" + m.nomeArtista + ";" + m.duracao);
		} else {
			lista.addLast(m.nome + ";" + m.nomeArtista + ";" + m.duracao);
		}
	}

	public void removeMusica(Lista lista, int posicao) throws Exception {
		if (lista.isEmpty()) {
			throw new Exception("Playlist Vazia");
		} else {
			int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da música que deseja remover"));
			lista.remove(pos);
		}
	}

	public void executaPlaylist(Lista lista) throws Exception {
		if (lista.isEmpty()) {
			throw new Exception("Playlist Vazia");
		} else {
			while (!lista.isEmpty()) {
				for (int i = 0; i < lista.size(); i++) {
					try {
						String m = lista.get(0);
						String[] info = m.split(";");
						System.out.println("[Musica: " + info[0] + " - Nome do Artista: " + info[1] + " - Duracao: "
								+ info[2] + " segundos]");
						System.out.println("Musica tocando...");
						Thread.sleep(1000 * (Integer.parseInt(info[2])));
						lista.removeFirst();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
