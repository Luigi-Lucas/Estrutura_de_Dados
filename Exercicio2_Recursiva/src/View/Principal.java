package View;

import Controller.OperacoesController;

public class Principal {

    public static void main(String[] args) {

        OperacoesController Op = new OperacoesController();

        int[] VT = {-12, 23, 5, -5, 6, -2, -1};
        int lenght = VT.length;

        System.out.println(Op.negativos(VT, lenght - 1));
    }
}
