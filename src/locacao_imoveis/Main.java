package locacao_imoveis;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Wemerson Matheus de Melo Amorim", "222.333.444-55", "81 9 9966-6699");

        cliente1.exibirInfo();

        Imovel imovel1 = new Imovel("Rua Jose de Nazare", 600,"Casa");

        imovel1.exibirInfo();

        ContratoLocacao contratoLocacao1 = new ContratoLocacao(cliente1, imovel1, LocalDate.of(2024, 10, 12), LocalDate.of(2025, 10, 12));

        contratoLocacao1.exbirInfo();

    }
}
