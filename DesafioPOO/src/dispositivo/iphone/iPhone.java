package dispositivo.iphone;

import dispositivo.aparelho_telefonico.AparelhoTelefonico;
import dispositivo.navegador_internet.NavegadorInternet;
import dispositivo.reprodutor_musical.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url + " no navegador");
    }
    
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    public void fecharAba() {
        System.out.println("Fechando aba no navegador");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página no navegador");
    }
    

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void desligar() {
        System.out.println("Desligando ligação");
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void recusar() {
        System.out.println("Recusando ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica);
    }

    public void avancar() {
        System.out.println("Avançando música");
    }

    public void retroceder() {
        System.out.println("Retrocendo música");
    }
}
