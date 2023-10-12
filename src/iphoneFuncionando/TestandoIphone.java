package iphoneFuncionando;

import funcionalidades.smartphone.Iphone2007;

public class TestandoIphone {
    public static void main(String[] args) {
        Iphone2007 iphone2007 = new Iphone2007();

        iphone2007.ligar();
        iphone2007.atender();
        iphone2007.iniciarCorreioVoz();

        iphone2007.exibirPagina();
        iphone2007.adicionarNovaAba();
        iphone2007.atualizarPagina();

        iphone2007.tocar();
        iphone2007.pausar();
        iphone2007.selecionarMusica();
    }
}
