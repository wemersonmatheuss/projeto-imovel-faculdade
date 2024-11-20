package locacao_imoveis;

public abstract class Pessoa {

    //atributos
    private String nome;
    private String cpf;
    private String telefone;

    //construtor
    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    //encapsulamento

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    //poliformismo

    public abstract void exibirInfo();


}
