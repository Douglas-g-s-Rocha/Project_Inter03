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

        System.out.println("Ainda não tem conta no nosso banco? \n" +
                            "Digite ( 1 ) para criar sua conta \n" +
                            "Digite ( 2 ) caso ja tenha conta ");
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                cadastroDeUser.executarCadastro_De_User();
                break;
            case 2:
                Login.executarlogin();
                break;

        }

    }



}