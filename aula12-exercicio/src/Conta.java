
public class Conta {
	private Integer numeroConta;
	private String Conta;
	private Double saldo;

	public Conta(Integer numeroConta, String conta, Double saldo) {
		super();
		this.numeroConta = numeroConta;
		Conta = conta;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", Conta=" + Conta + ", saldo=" + saldo + "]";
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public String getConta() {
		return Conta;
	}

	public Double getSaldo() {
		return saldo;
	}

}
