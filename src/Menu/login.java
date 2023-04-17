package Menu;

import Menu.Menu_Inicial;
import Data_Base.Usuario;
import java.util.Scanner;

public class login {

    public Usuario executarlogin(){

        Menu_Inicial menuInicial = new Menu_Inicial();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja Bem vindo ao Banco Tigas ");

        System.out.println("Digite seu email e senha para entrar na sua conta: ");

        System.out.println("Email: ");
        String Email = scanner.next();

        System.out.println("Senha: ");
        String Password = scanner.next();


        System.out.println("Digite  ( 0 ) e aperte Enter para entrar na sua conta");
        int enter = scanner.nextInt();
        switch (enter){
            case 0:
                menuInicial.executarConta();
                 break;
        }


        return new Usuario(Email, Password);
    }



}
