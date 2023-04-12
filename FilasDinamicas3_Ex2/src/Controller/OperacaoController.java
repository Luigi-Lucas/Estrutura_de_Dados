package Controller;

import br.edu.fateczl.filaobj.Fila;
import model.Cliente;

public class OperacaoController {

	public void caixa(Fila f) throws Exception{
		while (!f.isEmpty()) {
		try {
			Cliente c = (Cliente)f.remove();
			float total = c.quantidadePecas * c.valorPecas;
			System.out.println(c.nome + " = " + total);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
}
