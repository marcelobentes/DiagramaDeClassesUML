package produtos;

import funcoes.AparelhoTelefonico;

public class Nokia implements AparelhoTelefonico{
	public static void main(String[] args) {
		
	Nokia nokia3220 = new Nokia();
	nokia3220.atender();
	nokia3220.ligar();
	nokia3220.iniciarCorreioVoz();

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
