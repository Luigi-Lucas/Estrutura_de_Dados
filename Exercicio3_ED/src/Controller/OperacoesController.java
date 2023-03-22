package Controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	public int par(int VT[], int lenght) {
		if (lenght < 0) {
			return 0;
		} else if (VT[lenght] % 2 == 0) {
			return 1 + par(VT, lenght - 1);
		}
		return par(VT, lenght - 1);
	}
}
