package Programa;

public class Cliente {


    private static int counter = 1;
    private String nameP;
    private String nameU;
    private String idade;
    private String CPF;
    private String email;
    private String nomeMaeP;
    private String nomeMaeU;

    public Cliente(String nameP, String nameU, String idade, String CPF, String email, String nomeMaeP, String nomeMaeU) {
        this.nameP = nameP;
        this.nameU = nameU;
        this.idade = idade;
        this.CPF = CPF;
        this.email = email;
        this.nomeMaeP = nomeMaeP;
        this.nomeMaeU = nomeMaeU;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Cliente.counter = counter;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public String getNameU() {
        return nameU;
    }

    public void setNameU(String nameU) {
        this.nameU = nameU;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeMaeP() {
        return nomeMaeP;
    }

    public void setNomeMaeP(String nomeMaeP) {
        this.nomeMaeP = nomeMaeP;
    }

    public String getNomeMaeU() {
        return nomeMaeU;
    }

    public void setNomeMaeU(String nomeMaeU) {
        this.nomeMaeU = nomeMaeU;
    }

    public String toString(){
        return "\nNome: " + this.getNameP()+ this.getNameU()  +
                "\nNome da Mãe: " + this.getNomeMaeP() + this.getNomeMaeU() +
                "\nCPF: " + this.getCPF() +
                "\nEmail: " + this.getEmail() +
                "\nIdade: " + this.getIdade() ;
    }



}
