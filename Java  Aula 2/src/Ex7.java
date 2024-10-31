import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] vetores = new int[3][];
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o tamanho do vetor " + (i + 1) + ": ");
            int tamanho = scanner.nextInt();
            vetores[i] = new int[tamanho];

            System.out.println("Digite os elementos do vetor " + (i + 1) + ":");
            for (int j = 0; j < tamanho; j++) {
                vetores[i][j] = scanner.nextInt();
            }
        }

        double[] somas = new double[3];
        double[] produtos = new double[3];
        double[] medias = new double[3];

        for (int i = 0; i < 3; i++) {
            somas[i] = calcularSoma(vetores[i]);
            produtos[i] = calcularProduto(vetores[i]);
            medias[i] = calcularMedia(vetores[i]);

            System.out.println("Vetor " + (i + 1) + ":");
            System.out.println("Soma: " + somas[i]);
            System.out.println("Produto: " + produtos[i]);
            System.out.println("Média: " + medias[i]);
            System.out.println();
        }

        double somaSomas = calcularSoma(somas);
        double produtoProdutos = calcularProduto(produtos);
        double mediaMedias = calcularMedia(medias);

        System.out.println("Vetor de somas: ");
        exibirVetor(somas);

        System.out.println("Vetor de produtos: ");
        exibirVetor(produtos);

        System.out.println("Vetor de médias: ");
        exibirVetor(medias);

        System.out.println("\nSoma do vetor de somas: " + somaSomas);
        System.out.println("Produto do vetor de produtos: " + produtoProdutos);
        System.out.println("Média do vetor de médias: " + mediaMedias);

        scanner.close();
    }

    public static double calcularSoma(int[] vetor) {
        double soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return soma;
    }

    public static double calcularProduto(int[] vetor) {
        double produto = 1;
        for (int valor : vetor) {
            produto *= valor;
        }
        return produto;
    }

    public static double calcularMedia(int[] vetor) {
        return calcularSoma(vetor) / vetor.length;
    }

    public static double calcularSoma(double[] vetor) {
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma;
    }

    public static double calcularProduto(double[] vetor) {
        double produto = 1;
        for (double valor : vetor) {
            produto *= valor;
        }
        return produto;
    }

    public static double calcularMedia(double[] vetor) {
        return calcularSoma(vetor) / vetor.length;
    }

    public static void exibirVetor(double[] vetor) {
        for (double valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
