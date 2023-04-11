package Menu;

import Menu.login;
import Operações.Cadastro_De_User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cadastro_De_User cadastroDeUser = new Cadastro_De_User();
        login Login = new login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo ao BANCO TIGAS \n");

        int escolha = 0;

        do {
            System.out.println("Caso não tenha cadastro no nosso banco, Digite ( 1 ) \n" +
                    "Caso já tenha cadastro no nosso banco, Digite ( 2 )");

             escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    cadastroDeUser.executarCadastro_De_User();
                    break;
                case 2:
                    Login.executarlogin();
                    break;

            }

        }while ( escolha != 99);


    }
}