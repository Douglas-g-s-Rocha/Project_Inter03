package Menu;

import Data_Base.Usuario;
import java.util.Scanner;

public class login {

    public Usuario executarlogin(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja Bem vindo ao Banco Tigas ");

        System.out.println("Digite seu email e senha para entrar na sua conta: ");

        System.out.println("Email: ");
        String Email = scanner.nextLine();

        System.out.println("Senha: ");
        String Password = scanner.nextLine();



        return new Usuario(Email, Password);
    }



}
