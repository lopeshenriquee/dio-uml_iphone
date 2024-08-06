package com.dio.DesafioIphone;

public class Iphone implements AparelhoEletr�nico, NavegadorInternet, ReprodutorMusicial{

	@Override
	public void tocar() {
		System.out.println("Reproduzindo M�sica...");
		
	}

	@Override
	public void pausar() {
		System.out.println("M�sica pausada...");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando M�sica: " + musica);
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("P�gina: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova Aba...");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando P�gina...");
		
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
		iphoneHenrique.selecionarMusica("Kayblack - Mist�rios");
		
		iphoneHenrique.ligar("123456789");
		iphoneHenrique.atender();
		iphoneHenrique.iniciarCorreioVoz();
		
		iphoneHenrique.exibirPagina("https://www.google.com/");
		iphoneHenrique.adicionarNovaAba();
		iphoneHenrique.atualizarPagina();
		
	}
	
}
