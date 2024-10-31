import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();


        char[] caracteres = palavra.toCharArray();


        boolean isPalindromo = verificarPalindromo(caracteres);


        if (isPalindromo) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean verificarPalindromo(char[] array) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio < fim) {
            if (array[inicio] != array[fim]) {
                return false; 
            }
            inicio++;
            fim--;
        }

        return true; 
    }
}