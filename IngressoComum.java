package projeto;

public class IngressoComum extends Ingresso {
	
	String setor;

	public IngressoComum(String nome_evento, double valor, String setor) {
		super(nome_evento, valor);
		this.setor = setor;
	}
	
	void imprimir() {
		super.imprimir();
		System.out.println("Setor: " + setor);
	}

	
	


}
