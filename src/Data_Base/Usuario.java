package Data_Base;

public class Usuario {

    private String nome;
    private int cpf;
    private String data_Nascimento;
    private String email;
    private String password;
    private int cep;
    private int n_Endereco;
    private int n_Ctt;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public String getData_Nascimento() {
        return data_Nascimento;
    }
    public void setData_Nascimento(String data_Nascimento){
        this.data_Nascimento = data_Nascimento;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public int getCep() {
        return cep;
    }
    public void setCep(int cep){
        this.cep = cep;
    }

    public int getN_Endereco() {
        return n_Endereco;
    }
    public void setN_Endereco(int n_Endereco){
        this.n_Endereco = n_Endereco;
    }

    public int getN_Ctt() {
        return n_Ctt;
    }
    public void setN_Ctt(int n_Ctt){
        this.n_Ctt = n_Ctt;
    }

}
