package dispositivo.reprodutor_musical;

public interface ReprodutorMusical {
    public void tocar();
    public void pausar();
    public void selecionarMusica(String musica);
    public void avancar();
    public void retroceder();
}
