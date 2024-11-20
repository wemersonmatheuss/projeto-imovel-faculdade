package locacao_imoveis;

public class Imovel {

    private String endereco;
    private double valorAluguel;
    private String tipo; // casa, ap, etc...
    private boolean disponivel;

    public Imovel(String endereco, double valorAluguel, String tipo) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.tipo = tipo;
        this.disponivel = true;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void  exibirInfo () {
        System.out.println("Imovel:");

        System.out.println("Endereço: " + endereco + ", Valor do Aluguel: " + valorAluguel + ", Tipo: " + tipo + ", Disponivel: " + disponivel);

        System.out.println("");
    }
}
