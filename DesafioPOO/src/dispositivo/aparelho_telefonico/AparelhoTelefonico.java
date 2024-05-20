package dispositivo.aparelho_telefonico;

public interface AparelhoTelefonico {
    public void ligar(String numero);
    public void desligar();
    public void atender();
    public void recusar();
    public void iniciarCorreioVoz();
}
