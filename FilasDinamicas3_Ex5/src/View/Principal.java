package View;

import Controller.ParqueController;
import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		ParqueController pC = new ParqueController();
		
		Fila f = new Fila();
		
		for(int i = 1; i < 31; i++) {
			Pessoa p = new Pessoa();
			p.nome = "Pessoa" + i;
			p.idade = (int)((Math.random() * 31) + 10);
			p.altura = (float)((Math.random() * 0.66) + 1.35);
			f.insert(p);
		}

		pC.brinquedo(f);
	}

}
