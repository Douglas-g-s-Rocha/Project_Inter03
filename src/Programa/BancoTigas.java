package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoTigas {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<ContaBancaria> contasBancarias;


    public static void main(String[] args) {

        contasBancarias = new ArrayList<ContaBancaria>();

        Operacoes();

    }

    //Interface

    public static void Operacoes() {

        System.out.println("---------------------------------------------");
        System.out.println("----------Bem vindo ao Banco Tigas ----------");
        System.out.println("---------------------------------------------");
        System.out.println("----Selecione a Opção que deseja realizar----");
        System.out.println("---------------------------------------------\n");
        System.out.println("| Opção 1 ---------- Criar conta ---------- |\n");
        System.out.println("| Opção 2 ------------ Depositar ---------- |\n");
        System.out.println("| Opção 3 -------------- Sacar ------------ |\n");
        System.out.println("| Opção 4 ------------ Transferir --------- |\n");
        System.out.println("| Opção 5 -------------- Listar ----------- |\n");
        System.out.println("| Opção 6 --------------- Sair ------------ |");
        System.out.println("---------------------------------------------");

        int operacao = scan.nextInt();

        switch (operacao) {
            case 1:
                CriarConta();
                break;
            case 2:
                Depositar();
                break;
            case 3:
                Sacar();
                break;
            case 4:
                Transferir();
                break;
            case 5:
                Listar();
                break;
            case 6:
                System.out.println("---Obrigado pela preferencia !---");
                System.exit(0);

            default:
                System.out.println("---Opção inválida !---");
                Operacoes();
                break;
        }

    }

    // Criação de conta

    public static void CriarConta() {

        System.out.println("\nDigite seu primeiro nome: ");
        String nameP = scan.next();

        System.out.println("\nDigite seu ultimo sobrenome: ");
        String nameU = scan.next();

        System.out.println("\nDigite seu CPF: ");
        String CPF = scan.next();

        System.out.println("\nDigite seu Email: ");
        String Email = scan.next();

        System.out.println("\nDigite a sua idade: ");
        String Idade = scan.next();

        System.out.println("\nDigite o primeiro nome da mãe: ");
        String NomeMaeP = scan.next();

        System.out.println("\nDigite o ultimo sobrenome da mãe");
        String NomeMaeU = scan.next();





        Cliente cliente = new Cliente(nameP, nameU, Idade, CPF, Email, NomeMaeP,NomeMaeU );

        ContaBancaria conta = new ContaBancaria(cliente);
        contasBancarias.add(conta);

        System.out.println("---Sua conta foi criada com sucesso---");

        Operacoes();

    }

    // Aqui ele vai pegar as informações e levar para "ContaBancaria" para descobrir se é possivel realizar as operações ou não

    private static ContaBancaria EncontrarConta(int NumeroConta) {
        ContaBancaria contaBancaria = null;

        if (contasBancarias.size() > 0) {
            for (ContaBancaria c : contasBancarias) {
                if (c.getNumber() == NumeroConta) {
                    contaBancaria = c;
                }
            }
        }
        return contaBancaria;
    }

    public static void Depositar() {
        System.out.println("Número da Conta: ");
        int numConta = scan.nextInt();

        ContaBancaria conta = EncontrarConta(numConta);

        if (conta != null) {
            System.out.println("---Qual valor deseja depositar ?---");
            double valorDeposito = scan.nextDouble();
            conta.Depositar(valorDeposito);
            System.out.println("---Deposito realizado com sucesso !---");
        } else {
            System.out.println("---Conta não encontrada !---");
        }
        Operacoes();
    }

    public static void Sacar() {

        System.out.println("Número da Conta: ");
        int numConta = scan.nextInt();

        ContaBancaria conta = EncontrarConta(numConta);

        if (conta != null) {
            System.out.println("---Qual valor deseja Sacar ?---");
            double valorSacado = scan.nextDouble();
            conta.Sacar(valorSacado);
            System.out.println("---Saque realizado com sucesso !---");
        } else {
            System.out.println("---Conta não encontrada !---");
        }
        Operacoes();


    }

    public static void Transferir() {

        System.out.println("---Qual tipo de transferencia você deseja realizar?--- ");
        System.out.println("| Opção 1 -------Pix-------|\n");
        System.out.println("| Opção 2 -------Doc-------|\n");
        System.out.println("| Opção 3 -------Ted-------|\n");
        int op = scan.nextInt();

        switch (op){
            case 1:
                System.out.println("Número da conta do remetente: ");
                int NumContaRemet = scan.nextInt();

                ContaBancaria contaRemetente = EncontrarConta(NumContaRemet);

                if (contaRemetente != null) {
                    System.out.println("Número da conta do destinatário: ");
                    int NumContaDest = scan.nextInt();

                    ContaBancaria contaDest = EncontrarConta(NumContaDest);

                    if (contaDest != null) {
                        System.out.println("Valor da transferência: ");
                        double valor = scan.nextDouble();

                        contaRemetente.Transferir(contaDest, valor);

                    }
                }
                Operacoes();
                break;

            case 2:
                System.out.println("Número da conta do remetente: ");
                int NumContRemet = scan.nextInt();

                ContaBancaria contRemetente = EncontrarConta(NumContRemet);

                if (contRemetente != null) {
                    System.out.println("Número da conta do destinatário: ");
                    int NumContaDest = scan.nextInt();

                    ContaBancaria contaDest = EncontrarConta(NumContaDest);

                    if (contaDest != null) {
                        System.out.println("Valor da transferência: ");
                        double valor = scan.nextDouble();

                        double VT = valor - 15;

                        contRemetente.Transferir(contaDest, VT);

                    }
                }
                Operacoes();
                break;
            case 3:
                System.out.println("Número da conta do remetente: ");
                int NuContRemet = scan.nextInt();

                ContaBancaria conRemetente = EncontrarConta(NuContRemet);

                if (conRemetente != null) {
                    System.out.println("Número da conta do destinatário: ");
                    int NumContaDest = scan.nextInt();

                    ContaBancaria conDest = EncontrarConta(NumContaDest);

                    if (conDest != null) {
                        System.out.println("Valor da transferência: ");
                        double valor = scan.nextDouble();

                        double VT1 = valor - 10;

                        conRemetente.Transferir(conDest, VT1);

                    }
                }
                Operacoes();
        }



    }

    public static void Listar() {

        if (contasBancarias.size() > 0) {
            for (ContaBancaria conta : contasBancarias) {
                System.out.println(conta);
            }

        } else {
            System.out.println("---Não há contas cadastradas !---");
        }
        Operacoes();

    }
}