package Controller;

public class OperacoesController {

    public OperacoesController() {
        super();
    }

    public int fatorial(int A) {

        //Condição de parada: quando "A" chegar á zero, pois já terá se multiplicado com o fatorial de seus valores antecessores.
        if (A == 0) {
            return 1;
        } else {
            return A * fatorial(A - 1); /* O valor de "A" irá se multiplicar por um determinado número de vezes
                                              pelo fatorial do seu valor antecessor, ou seja, a chamada da função
                                              de A - 1. */
        }
    }
}
