package Controller;

import Model.Morador;
import br.edu.fateczl.listaobject.Lista;

public class ApartamentoController {
	
	Lista[] vetApartamento;

	public ApartamentoController() {
		vetApartamento = new Lista[10];
		for(int i = 0; i < 10; i++) {
			vetApartamento[i] = new Lista();
		}
	}
	
	public void cadastrarMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode();
	    vetApartamento[posicao].addFirst(morador);
	}
	
	public void consultarMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode();
		int tamanho = vetApartamento[posicao].size();
		for (int i = 0; i < tamanho; i++) {
			Morador m = (Morador) vetApartamento[posicao].get(i);
			if (m.numeroApto == morador.numeroApto) {
				System.out.println(m.toString());
				break;
			}
		}
	}
	
	public void excluirMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode();
		int tamanho = vetApartamento[posicao].size();
		for (int i = 0; i < tamanho; i++) {
			Morador m = (Morador) vetApartamento[posicao].get(i);
			if (m.numeroApto == morador.numeroApto) {
				vetApartamento[posicao].remove(i);
				break;
			}
		}
	}
	
	public void listarMoradores(int andar) throws Exception {
		int posicao = andar;
		int tamanho = vetApartamento[posicao].size();
		for (int i = 0; i < tamanho; i++) {
			Morador m = (Morador) vetApartamento[posicao].get(i);
			System.out.println(m.toString());
		}
	}
}
