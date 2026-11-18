package projeto;

public class Ingresso {
	String nome_evento;
	double valor;
	
	public Ingresso(String nome_evento, double valor) {
		super();
		this.nome_evento = nome_evento;
		this.valor = valor;
		
	}
	
	void imprimir() {
		System.out.println("Nome evento: " + nome_evento);
		System.out.println("Valor: " + valor);
	}
	
}
