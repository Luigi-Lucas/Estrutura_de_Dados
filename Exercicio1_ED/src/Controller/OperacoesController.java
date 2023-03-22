package Controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	
	public int mult(int A, int B) {
		if (B < 1) {
			return 0;
		}
		return A + mult(A, B - 1);
	}
}
