package Controller;

public class OperacoesController {

    public OperacoesController() {
        super();
    }

    public String inverso(String palavra, int lenght) {

        //Condição de parada: quando não houver mais letras que compõe a string.
        if (lenght < 0) {
            return " ";
        } else {
            return palavra.substring(lenght, lenght + 1) + inverso(palavra, lenght - 1); /* Retorna as letras contidas na palavra de trás para frente, indo da última letra
                                                                                                    até a primeira utilizando substring com seu "lenght" (no exemplo com a palavra "SOL")
                                                                                                    valendo 2 e 3, diminui-se 1 em lenght, e depois 1 e 2, diminuindo lenght novamente e
                                                                                                    por fim 0 e 1. */
        }
    }
}

