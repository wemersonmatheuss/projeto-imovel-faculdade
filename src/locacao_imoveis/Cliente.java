package locacao_imoveis;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;

    public Cliente (String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }
}
