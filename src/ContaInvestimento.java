
public class ContaInvestimento extends Conta {

    public ContaInvestimento(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Investimento ===");
        super.depositar(calculaJuros(super.getSaldo()));
        super.imprimirInfosComuns();
    }

    private double calculaJuros (Double valor) {
        double juros = 0.03;
        double calculo = valor*juros;
        return calculo;
    }

}