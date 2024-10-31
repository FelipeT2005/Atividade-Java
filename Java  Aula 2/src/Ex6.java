import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a massa inicial do material (em gramas): ");
        double massaInicial = scanner.nextDouble();

        double massaAtual = massaInicial;
        int tempoTotalSegundos = 0;

        while (massaAtual >= 0.5) {
            massaAtual /= 2;
            tempoTotalSegundos += 50;
        }

        int horas = tempoTotalSegundos / 3600;
        int minutos = (tempoTotalSegundos % 3600) / 60;
        int segundos = tempoTotalSegundos % 60;

        System.out.println("Massa inicial: " + massaInicial + " gramas");
        System.out.println("Massa final: " + massaAtual + " gramas");
        System.out.println("Tempo necessário: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");

        scanner.close();
    }
}
