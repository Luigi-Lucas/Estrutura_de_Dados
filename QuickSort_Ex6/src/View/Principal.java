package View;

import br.edu.fateczl.calc.Ordenacao;

public class Principal {

	public static void main(String[] args) {
		
		Ordenacao ordenacao = new Ordenacao();
		
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		ordenacao.quickSort(vetor, 0, vetor.length - 1);
		
		for(int valor : vetor) {
			System.out.print(valor + " ");
		}
	}
}
