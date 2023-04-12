package Operações;



import java.util.Scanner;

public class Cadastro_De_User {


    public String executarCadastro_De_User() {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Cadastro BANCO TIGAS");

        System.out.println("Digite o seu nome completo: ");
        String Nome = scanner.nextLine();

        System.out.println("Digite o seu CPF: ");
        String CPF = scanner.nextLine();

        System.out.println("Digite o dia do seu nascimento: ");
        String diaNasc = scanner.nextLine();

        System.out.println("Digite o mês do seu nascimento: ");
        String mesNasc = scanner.nextLine();

        System.out.println("Digite o ano do seu nascimento: ");
        String anoNasc = scanner.nextLine();

        System.out.println("Digite seu Email: ");
        String Email = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String Password = scanner.nextLine();

        System.out.println("Confirme sua senha: ");
        String confPass = scanner.nextLine();
        if (confPass == Password) {

        } else {

                System.out.println("Senha incorreta! Digite novamente!");

            System.out.println("Confirme sua senha: ");
            confPass = scanner.nextLine();



            }
        System.out.println("Digite o seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite seu numero para possiveis contatos: ");
        int ctt = scanner.nextInt();

      return null;
    }


}
