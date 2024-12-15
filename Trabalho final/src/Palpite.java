public class Palpite {
    private Jogador jogador;
    private Time time;
    private int fichas;

    public Palpite(Jogador jogador, Time time, int fichas) {
        this.jogador = jogador;
        this.time = time;
        this.fichas = fichas;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Time getTime() {
        return time;
    }

    public int getFichas() {
        return fichas;
    }

    @Override
    public String toString() {
        return "Jogador: " + jogador.getNome() + ", Time: " + time.getNome() + ", Fichas: " + fichas;
    }
}
