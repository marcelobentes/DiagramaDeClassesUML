package produtos;

import funcoes.Navegador;

public class Edge implements Navegador{
	public static void main(String[] args) {
		Edge edge = new Edge();
		edge.exibirPagina();
		edge.adicionarAba();
		edge.atualizarPagina();
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina no navegador.");
		
	}

	@Override
	public void adicionarAba() {
		System.out.println("Adicionando nova Aba...");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada.");
		
	}

}
