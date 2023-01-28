package produtos;

import funcoes.ReprodutorMusical;

public class Mp4 implements ReprodutorMusical{
	public static void main(String[] args) {
		Mp4 mp4 = new Mp4();
		mp4.tocar();
		mp4.pausar();
		mp4.selecionarMusica();
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

}
