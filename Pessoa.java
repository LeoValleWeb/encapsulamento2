public class Pessoa{

    private String nome;
    private int idade;
    private String celular;
    private String cpf;

    //métodos de acesso público

    public String getNome(){
        return this.nome;
    }
    public void getNome(String nome){
        this.nome=nome;
    }

    public int setIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }

    public String getCelular(){
        return this.celular;
    }
    public void setCelular(String celular){
        this.celular=celular;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }


}