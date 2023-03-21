package Controller;

public class OperacoesController {

    public OperacoesController() {
        super();
    }

    public int digitos(int A) {

        //Condição de parada: quando o valor do número digitado for menor que dez, pois significa que restou apenas um dígito.
        if (A < 10) {
            return 1;
        } else {
            return 1 + digitos(A / 10); //Retorna a soma de 1 com o retorno da função dividindo o número por 10 N vezes até que sobre apenas um dígito.
        }
    }
}
