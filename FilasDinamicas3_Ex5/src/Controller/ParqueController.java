package Controller;

import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;

public class ParqueController {

	public void brinquedo(Fila f) throws Exception{
		while (!f.isEmpty()) {
		try {
			Pessoa p = (Pessoa)f.remove();
			if (p.altura > 1.60 && p.idade > 16) {
				System.out.println(p.nome + " Passou pelo brinquedo.");
			} else if(p.altura < 1.60) {
				System.out.println(p.nome + " não passou pelo brinquedo. Motivo: altura inferior ao exigido.");
			} else if(p.idade < 16) {
				System.out.println(p.nome + " não passou pelo brinquedo. Motivo: idade inferior ao exigido.");
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
}
