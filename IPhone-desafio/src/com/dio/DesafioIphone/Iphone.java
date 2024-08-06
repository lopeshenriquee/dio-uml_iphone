package com.dio.DesafioIphone;

public class Iphone implements AparelhoEletrônico, NavegadorInternet, ReprodutorMusicial{

	@Override
	public void tocar() {
		System.out.println("Reproduzindo Música...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada...");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando Música: " + musica);
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Página: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova Aba...");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página...");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz...");
		
	}
	
	public static void main(String[] args) {
		Iphone iphoneHenrique = new Iphone();
		
		iphoneHenrique.tocar();
		iphoneHenrique.pausar();
		iphoneHenrique.selecionarMusica("Kayblack - Mistérios");
		
		iphoneHenrique.ligar("123456789");
		iphoneHenrique.atender();
		iphoneHenrique.iniciarCorreioVoz();
		
		iphoneHenrique.exibirPagina("https://www.google.com/");
		iphoneHenrique.adicionarNovaAba();
		iphoneHenrique.atualizarPagina();
		
	}
	
}
