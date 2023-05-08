package Programa;

public class Cliente {


    private static int counter = 1;
    private String name;
    private String CPF;
    private String email;

    public Cliente(String name, String CPF, String email) {

        this.name = name;
        this.CPF = CPF;
        this.email = email;
        counter += 1;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String toString(){
        return "\nNome: " + this.getName() +
                "\nCPF: " + this.getCPF() +
                "\nEmail: " + this.getEmail();
    }



}
