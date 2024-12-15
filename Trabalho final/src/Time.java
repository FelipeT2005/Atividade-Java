public class Time {
    private String nome;
    private int pontuacao = 0;
    private int saldoGols = 0;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarPontos(int pontos) {
        pontuacao += pontos;
    }

    public void atualizarSaldoGols(int gols) {
        saldoGols += gols;
    }

    @Override
    public String toString() {
        return nome + " - Pontuação: " + pontuacao + ", Saldo de gols: " + saldoGols;
    }
}
