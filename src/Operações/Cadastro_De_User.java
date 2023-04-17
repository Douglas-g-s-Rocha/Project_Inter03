package Operações;


import java.util.Scanner;

public class Cadastro_De_User {


    public String executarCadastro_De_User() {

        int Ano = 2007;
        Scanner scanner = new Scanner(System.in);


//CADASTRO

        System.out.println("Cadastro BANCO TIGAS");

        System.out.println("Digite o seu nome completo: ");
        String Nome = scanner.next();

        System.out.println("Digite seu Email: ");
        String email = scanner.next();

        System.out.println("Digite o seu CPF: ");
        String CPF = scanner.next();

        System.out.println("OBS: Idade minima para cadastro é de 16 anos");
        System.out.println("Digite o dia do seu nascimento: ");
        String diaNasc = scanner.next();

        System.out.println("Digite o mês do seu nascimento: ");
        String mesNasc = scanner.next();

        System.out.println("Digite o ano do seu nascimento: ");
        int anoNasc = scanner.nextInt();


//LIMITAÇÃO DE IDADE
        int idade = anoNasc - Ano;
        if (anoNasc >= idade ) {

        }else {
            System.out.println("Idade indisponivel para cadastro! ");
        }


//SENHA
        System.out.println("Digite sua senha: ");
        String Password = scanner.next();



//CONFIRMAÇÃO DE SENHA
        System.out.println("Confirme sua senha: ");
        String confPass = scanner.next();

        if (confPass == Password) {

            System.out.println("Digite o seu endereço: ");
            String endereco = scanner.next();

            System.out.println("Digite seu numero para possiveis contatos: ");
            int ctt = scanner.nextInt();

        } else if (confPass != Password) {

            System.out.println("Senha incorreta! Digite novamente!");
            System.out.println("Confirme sua senha: ");
            confPass = scanner.next();

        }else
        {

                System.out.println("Senha incorreta! Digite novamente!");
                System.out.println("Confirme sua senha: ");
                confPass = scanner.next();

            }


      return null;
    }


}
