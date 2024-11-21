package locacao_imoveis;

import java.time.LocalDate;

public class ContratoLocacao {

    private Cliente cliente;
    private Imovel imovel;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valorMensal;
    private boolean ativo;

    public ContratoLocacao(Cliente cliente, Imovel imovel, LocalDate dataInicio, LocalDate dataTermino) {
        this.cliente = cliente;
        this.imovel = imovel;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorMensal = valorMensal;
        this.ativo = true;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void exbirInfo () {
        System.out.println("Contrato:");

        System.out.println("");

        cliente.exibirInfo();

        imovel.exibirInfo();

        System.out.println("Data de inicio: " + dataInicio + ", Data de termino: " + dataTermino);
    }
}
