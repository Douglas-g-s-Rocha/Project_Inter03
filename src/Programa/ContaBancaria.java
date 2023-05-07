package Programa;

import Programa.Utilitario.Utils;

public class ContaBancaria {

    //Esta em portugues para não ter repetições
    private static int ContadorDeContas = 1;

    //Numero da conta
    private int number;
    private Cliente cliente;
    private double saldo = 0.00;

    public ContaBancaria( Cliente cliente) {
        this.number = ContadorDeContas;
        this.cliente = cliente;
        ContadorDeContas += 1;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return "\nNúmero da conta: " + this.getNumber() +
                "\nNome: " + this.cliente.getName() +
                "\nCPF: " + this.cliente.getCPF() +
                "\nEmail: " + this.cliente.getEmail() +
                "\nSaldo: " + Utils.DoubleToString(this.getSaldo()) +
                "\n";

    }

    public void Depositar(double valor){

// Se o deposito for maior que zero será possivel ter a opção de deposito

        if(valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito aprovado !");
        }else {
            System.out.println("Deposito recusado !");
        }

    }

    public void Sacar(double valor){

// Se o valor for  maior que 0 e for o saldo for maior ou igual o valor do saque será realizado a operação

        if (valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque aprovado !");
        }else {
            System.out.println("Saque recusado !");
        }
    }

    public void Transferir(ContaBancaria ContaDeposito, double valor){

// Se o valor for  maior que 0 e for o saldo for maior ou igual o valor da transferencia será realizado a operação
//  Aqui, diferente dos outros, ele vai conferir se vai ter o numero das contas corretamente

        if (valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);

            ContaDeposito.saldo = ContaDeposito.getSaldo() + valor;
            System.out.println("Transferência aprovada !");
        }else {

            System.out.println("Transferência recusada !");

        }

    }



}
