package Controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	public double divisao(double num, double divisor) {
		if (num < divisor) {
			return num;
		}
		return divisao(num - divisor, divisor);
	}
}
