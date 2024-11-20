package locacao_imoveis;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Wemerson Matheus de Melo Amorim", "222.333.444-55", "81 9 9966-6699");

        System.out.println(cliente1.getCpf() + cliente1.getNome() + cliente1.getTelefone());

        cliente1.setNome("Imaculada");

        System.out.println(cliente1.getCpf() + cliente1.getNome() + cliente1.getTelefone());






    }
}
