import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Partida {
    private Time time1;
    private Time time2;
    private int golsTime1;
    private int golsTime2;
    private Map<Jogador, Palpite> palpites = new HashMap<>();

    public Partida(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public Time getTime1() {
        return time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void registrarPalpite(Jogador jogador, Time time, int fichas) {
        if (time != time1 && time != time2) {
            throw new IllegalArgumentException("O palpite deve ser para um dos times da partida.");
        }
        Palpite palpite = new Palpite(jogador, time, fichas);
        palpites.put(jogador, palpite);
    }

    public void jogarPartida() {
        Random random = new Random();
        golsTime1 = random.nextInt(5); // Gols aleatórios para o time 1
        golsTime2 = random.nextInt(5); // Gols aleatórios para o time 2
    }

    public String getPlacar() {
        return golsTime1 + " x " + golsTime2;
    }

    public void atualizarPontuacoes() {
        if (golsTime1 > golsTime2) {
            time1.adicionarPontos(3);
            time1.atualizarSaldoGols(golsTime1 - golsTime2);
        } else if (golsTime2 > golsTime1) {
            time2.adicionarPontos(3);
            time2.atualizarSaldoGols(golsTime2 - golsTime1);
        } else {
            time1.adicionarPontos(1);
            time2.adicionarPontos(1);
        }

        for (Palpite palpite : palpites.values()) {
            if (palpite.getTime() == time1 && golsTime1 > golsTime2 ||
                palpite.getTime() == time2 && golsTime2 > golsTime1) {
                int pontosGanhos = palpite.getFichas() * Math.abs(golsTime1 - golsTime2);
                palpite.getJogador().adicionarPontos(pontosGanhos);
            }
        }
    }

    @Override
    public String toString() {
        return time1.getNome() + " " + golsTime1 + " x " + golsTime2 + " " + time2.getNome();
    }
}
