public class Jogador {
    private String nome;
    private int fichas = 50;
    private int pontuacao = 0;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getFichas() {
        return fichas;
    }

    public void fazerPalpite(Partida partida, Time time, int fichasApostadas) {
        if (fichasApostadas <= fichas) {
            fichas -= fichasApostadas;
            partida.registrarPalpite(this, time, fichasApostadas);
        } else {
            System.out.println("Fichas insuficientes!");
        }
    }


    public void adicionarPontos(int pontos) {
        pontuacao += pontos;
    }

    @Override
    public String toString() {
        return nome + " - Pontuação: " + pontuacao + ", Fichas restantes: " + fichas;
    }
}
