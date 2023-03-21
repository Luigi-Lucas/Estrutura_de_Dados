package Controller;

public class OperacoesController {

    public OperacoesController() {
        super();
    }

    public int negativos(int[] VT, int lenght) {
        //Condição de parada: quando o vetor não tiver mais posições.
        if (lenght < 0) {
            return 0;
        } else if (VT[lenght] < 0) {
            return 1 + negativos(VT, lenght - 1); //Retorno baseado na condição de haver um número negativo, soma-se 1 e diminui em 1 o tamanho do vetor para verificar a próxima posição.
        }
        return negativos(VT, lenght - 1); //Retorno baseado na condição do valor do vetor ser positivo, apenas diminui em 1 o tamanho do vetor.
    }
}
