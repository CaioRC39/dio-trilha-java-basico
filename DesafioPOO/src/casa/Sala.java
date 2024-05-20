package casa;

import dispositivo.iphone.iPhone;

public class Sala {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        
        iphone.adicionarNovaAba();
        iphone.exibirPagina("dio.me");
        iphone.atualizarPagina();
        iphone.fecharAba();

        iphone.ligar("58476548415");
        iphone.desligar();
        iphone.atender();
        iphone.desligar();
        iphone.recusar();
        iphone.iniciarCorreioVoz();

        iphone.selecionarMusica("A Thousando Miles");
        iphone.tocar();
        iphone.retroceder();
        iphone.avancar();
        iphone.avancar();
        iphone.pausar();

    }
}
