package projeto;

public class IngressoVip extends Ingresso {
	double adicional;

	public IngressoVip(String nome_evento, double valor, double adicional) {
		super(nome_evento, valor);
		this.adicional = adicional;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Adicional: " + adicional);
		System.out.println("Valor total: " + (valor+adicional));
	}

	
}
