
public class Main {

	public static void main(String[] args) {
		Cliente jonatas = new Cliente();
		jonatas.setNome("Jonatas");
		
		Conta cc = new ContaCorrente(jonatas);
		Conta poupanca = new ContaPoupanca(jonatas);
		Conta investimento = new ContaInvestimento(jonatas);

		cc.depositar(2000);
		cc.transferir(100, poupanca);
		cc.transferir(1000, investimento);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		investimento.imprimirExtrato();
	}

}