package exercicio.model;

public class Atleta implements Olimpiadas {
	private String nome;
	private double peso;
	private String modalidade;
	private Pais pais;
	private static int totalParticipantes;

	public Atleta(String nome, double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
	}

	@Override
	public String verificaSituacao() {
		if (peso > 90) {
			setModalidade("Peso Pesado");
			totalParticipantes++;
			return "Participará";
		} else if (peso > 60 && peso < 90) {
			setModalidade("Peso Médio");
			totalParticipantes++;
			return "Participará";
		} else {
			return "Não Participará";
		}

	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Pais getPais() {
		return pais;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

}
