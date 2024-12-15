import java.util.*;

public class Palpitao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Configuração inicial
        System.out.println("Bem-vindo ao Palpitão!");
        System.out.print("Nome do Jogador 1: ");
        Jogador jogador1 = new Jogador(scanner.nextLine());
        System.out.print("Nome do Jogador 2: ");
        Jogador jogador2 = new Jogador(scanner.nextLine());

        System.out.print("Número de times (4 ou 8): ");
        int numTimes = scanner.nextInt();
        scanner.nextLine(); 
        List<Time> times = new ArrayList<>();
        for (int i = 0; i < numTimes; i++) {
            System.out.print("Nome do time " + (i + 1) + ": ");
            times.add(new Time(scanner.nextLine()));
        }

        // Criar partidas
        List<Partida> partidas = gerarPartidas(times);

        // Jogar as partidas e registrar palpites
        for (Partida partida : partidas) {
            System.out.println("\nPartida: " + partida.getTime1().getNome() + " vs " + partida.getTime2().getNome());
            realizarPalpite(scanner, jogador1, partida);
            realizarPalpite(scanner, jogador2, partida);

            // Gerar placar aleatório para a partida
            partida.jogarPartida();
            System.out.println("Resultado: " + partida.getPlacar());

            // Atualizar pontuações dos times e jogadores
            partida.atualizarPontuacoes();
        }

        // Mostrar resultados finais
        mostrarResultados(times, jogador1, jogador2, partidas);

        scanner.close();
    }

    private static List<Partida> gerarPartidas(List<Time> times) {
        List<Partida> partidas = new ArrayList<>();
        for (int i = 0; i < times.size(); i++) {
            for (int j = i + 1; j < times.size(); j++) {
                partidas.add(new Partida(times.get(i), times.get(j)));
            }
        }
        return partidas;
    }

    private static void realizarPalpite(Scanner scanner, Jogador jogador, Partida partida) {
        System.out.println("Jogador " + jogador.getNome() + ", faça seu palpite:");
        System.out.println("1 - Vitória de " + partida.getTime1().getNome());
        System.out.println("2 - Vitória de " + partida.getTime2().getNome());
        int escolha = scanner.nextInt();
        System.out.print("Quantas fichas deseja apostar? (Fichas disponíveis: " + jogador.getFichas() + "): ");
        int fichas = scanner.nextInt();

        Time timeEscolhido = (escolha == 1) ? partida.getTime1() : partida.getTime2();
        jogador.fazerPalpite(partida, timeEscolhido, fichas);
    }

    private static void mostrarResultados(List<Time> times, Jogador jogador1, Jogador jogador2, List<Partida> partidas) {
        System.out.println("\n--- RESULTADOS FINAIS ---");
        System.out.println("Jogadores:");
        System.out.println(jogador1);
        System.out.println(jogador2);

        System.out.println("\nTimes:");
        for (Time time : times) {
            System.out.println(time);
        }

        System.out.println("\nPartidas:");
        for (Partida partida : partidas) {
            System.out.println(partida);
        }
    }
}
