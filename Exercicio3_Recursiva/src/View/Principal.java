package View;

import Controller.OperacoesController;

/* Crie uma função recursiva que exiba a quantidade de
   dígitos de umnúmero inteiro passado como parâmetro */

public class Principal {

    public static void main(String[] args) {

        OperacoesController Op = new OperacoesController();

        int A = 2478;

        System.out.println(Op.digitos(A));
    }
}
