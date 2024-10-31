import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de funcionários que podem ser votados: ");
        int quantidadeFuncionarios = scanner.nextInt();
        scanner.nextLine();
        String[] funcionarios = new String[quantidadeFuncionarios];
        int[] votos = new int[quantidadeFuncionarios];

        System.out.println("Digite os nomes dos funcionários:");
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.print("Funcionário " + (i + 1) + ": ");
            funcionarios[i] = scanner.nextLine();
        }

        System.out.print("Informe o número de funcionários que irão votar: ");
        int quantidadeVotantes = scanner.nextInt();

        for (int i = 0; i < quantidadeVotantes; i++) {
            System.out.println("Funcionários disponíveis para votar:");
            for (int j = 0; j < funcionarios.length; j++) {
                System.out.println((j + 1) + " - " + funcionarios[j]);
            }

            System.out.print("Funcionário " + (i + 1) + ", digite o número do colega em quem deseja votar: ");
            int voto = scanner.nextInt();

            if (voto > 0 && voto <= funcionarios.length) {
                votos[voto - 1]++;
            } else {
                System.out.println("Voto inválido, tente novamente.");
                i--; // Volta uma iteração para refazer o voto
            }
        }

        String vencedor = obterVencedor(funcionarios, votos);
        int totalVotos = votos[obterIndiceVencedor(votos)];

        System.out.println("O funcionário do mês é: " + vencedor + " com " + totalVotos + " votos.");

        scanner.close();
    }

    public static String obterVencedor(String[] funcionarios, int[] votos) {
        int indiceVencedor = obterIndiceVencedor(votos);
        return funcionarios[indiceVencedor];
    }

    public static int obterIndiceVencedor(int[] votos) {
        int maxVotos = votos[0];
        int indiceVencedor = 0;

        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                indiceVencedor = i;
            }
        }

        return indiceVencedor;
    }
}
