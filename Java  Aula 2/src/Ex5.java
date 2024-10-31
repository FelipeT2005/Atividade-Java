import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de nomes: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        String[] nomes = new String[quantidade];

        System.out.println("Digite os nomes:");
        for (int i = 0; i < quantidade; i++) {
            nomes[i] = scanner.nextLine();
        }

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
            verificarLetras(nome);
            System.out.println();
        }

        scanner.close();
    }

    public static void verificarLetras(String nome) {
        for (char letra : nome.toLowerCase().toCharArray()) {
            if (Character.isLetter(letra)) {
                if (isVogal(letra)) {
                    System.out.println(letra + " é vogal.");
                } else {
                    System.out.println(letra + " é consoante.");
                }
            }
        }
    }

    public static boolean isVogal(char letra) {
        return "aeiou".indexOf(letra) != -1;
    }
}
