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
        System.out.println("---------------------------------------------");
        System.out.println("| Opção 1 ---------- Criar conta ---------- |");
        System.out.println("| Opção 2 ------------ Depositar ---------- |");
        System.out.println("| Opção 3 -------------- Sacar ------------ |");
        System.out.println("| Opção 4 ------------ Transferir --------- |");
        System.out.println("| Opção 5 -------------- Listar ----------- |");
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

        System.out.println("\nNome: ");
        String Nome = scan.next();

        System.out.println("\nCPF: ");
        String CPF = scan.next();

        System.out.println("\nEmail: ");
        String Email = scan.next();

        Cliente cliente = new Cliente(Nome, CPF, Email);

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