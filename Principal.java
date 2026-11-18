package projeto;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		
		ArrayList<Ingresso> ListaIngressos = new ArrayList();
		
		ListaIngressos.add(new IngressoComum("Show do mario", 100,"Setor A"));
		ListaIngressos.add(new IngressoComum("Show do mario", 100,"Setor A"));
		ListaIngressos.add(new IngressoVip("Show do mario vip", 100,50));
		
		for(Ingresso e : ListaIngressos) {
			e.imprimir();
			System.out.println("=======");
		}
		

	}

}
