package funcionalidades.smartphone;

import funcionalidades.aparelhoTelefonico.AparelhoTelefonico;
import funcionalidades.navegadorInternet.NavegadorInternet;
import funcionalidades.reprodutorMusical.ReprodutorMusical;

public class Iphone2007 implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("LIGANDO VIA IPHONE 2007");

    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO VIA IPHONE 2007");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ VIA IPHONE 2007");

    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA WEB VIA IPHONE 2007");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA WEB VIA IPHONE 2007");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA WEB VIA IPHONE 2007");

    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA VIA IPHONE 2007");

    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA VIA IPHONE 2007");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA VIA IPHONE 2007");

    }
}
