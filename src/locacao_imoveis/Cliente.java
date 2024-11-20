package locacao_imoveis;

public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, String telefone){
        super(nome, cpf, telefone);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Cliente: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
    }
}
