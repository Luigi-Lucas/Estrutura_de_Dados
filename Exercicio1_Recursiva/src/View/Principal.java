package View;

import Controller.OperacoesController;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OperacoesController Op = new OperacoesController();

        int A;

        do {
            A = sc.nextInt();
        } while (A > 12);

        System.out.println(Op.fatorial(A));
    }
}
