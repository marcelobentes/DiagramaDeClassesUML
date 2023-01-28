package produtos;

import funcoes.AparelhoTelefonico;
import funcoes.Navegador;
import funcoes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, Navegador{
	
	public static void main(String[] args) {
		Iphone iphoneX = new Iphone();
		iphoneX.ligar();
		iphoneX.atender();
		iphoneX.iniciarCorreioVoz();
		iphoneX.tocar();
		iphoneX.pausar();
		iphoneX.selecionarMusica();
		iphoneX.exibirPagina();
		iphoneX.adicionarAba();
		iphoneX.atualizarPagina();
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

	@Override
	public void tocar() {
		System.out.println("Tocando musica...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a musica.");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica.");
		
	}

	@Override
	public void ligar() {
		System.out.println("Realizando ligação.");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação.");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Ouvindo correio de voz.");
		
	}

}
