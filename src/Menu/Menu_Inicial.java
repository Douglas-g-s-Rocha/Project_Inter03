package Menu;
import Menu.login;

import java.util.Scanner;

public class Menu_Inicial {

    public String executarConta(){

        Scanner scanner = new Scanner(System.in);
        int Saldo = 1000;

        System.out.println("Seja bem vindo a Sua conta!");
        System.out.println("Seu saldo é de: " + Saldo);

        System.out.println("Digite 1 para fazer transferencia \n" +
                            "Digite 2 para sair do app");
        int esc = scanner.nextInt();

        switch (esc) {

            case 1:

                    break;
            case 2:

                    break;

        }


        return null;
    }


}
