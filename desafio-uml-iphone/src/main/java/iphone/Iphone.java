package iphone;

import iphone.internet.NavegadorNaInternet;
import iphone.ipod.ReprodutorMusical;
import iphone.telefone.AparelhoTelefonico;

public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorNaInternet navegadorNaInternet = new NavegadorNaInternet();

        reprodutorMusical.tocar();
        reprodutorMusical.selecionarMusica("Yellow submarine");
        reprodutorMusical.pausar();

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorNaInternet.exibirPagina("www.google.com");
        navegadorNaInternet.adicionarNovaAba();
        navegadorNaInternet.atualizarPagina();

    }
}
