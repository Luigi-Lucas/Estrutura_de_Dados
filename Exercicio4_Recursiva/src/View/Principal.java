package View;

import Controller.OperacoesController;

/* Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres (Ex.:
   entrada = teste ; saída = etset */
public class Principal {

    public static void main(String[] args) {

        OperacoesController Op = new OperacoesController();

        String palavra = "Sol";
        int lenght = palavra.length();

        System.out.println(Op.inverso(palavra, lenght - 1));
    }
}
