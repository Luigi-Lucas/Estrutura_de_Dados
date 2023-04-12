package View;

import Controller.OperacaoController;
import br.edu.fateczl.filaobj.Fila;
import model.Cliente;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		OperacaoController oP = new OperacaoController();
		
		Fila f = new Fila();
		
		for(int i = 1; i < 21; i++) {
			Cliente c = new Cliente();
			c.nome = "Cliente" + i;
			c.quantidadePecas = (int)((Math.random() * 31) + 20);
			c.valorPecas = (int)((Math.random() * 96) + 5);
			f.insert(c);
		}

		oP.caixa(f);
	}

}
