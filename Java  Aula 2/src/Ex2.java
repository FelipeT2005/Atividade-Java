import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de elementos do array: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        int soma = calcularSoma(numeros);
        System.out.println("Soma dos elementos: " + soma);

        int maior = calcularMaior(numeros);
        int menor = calcularMenor(numeros);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        double media = calcularMedia(numeros);
        System.out.println("Média dos elementos: " + media);

      
        double mediana = calcularMediana(numeros);
        System.out.println("Mediana dos elementos: " + mediana);


        int moda = calcularModa(numeros);
        if (moda != Integer.MIN_VALUE) {
            System.out.println("Moda dos elementos: " + moda);
        } else {
            System.out.println("Moda dos elementos: Não existe (não há elementos repetidos).");
        }

        scanner.close();
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }

 
    public static int calcularMaior(int[] array) {
        int maior = array[0];
        for (int num : array) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }


    public static int calcularMenor(int[] array) {
        int menor = array[0];
        for (int num : array) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }


    public static double calcularMedia(int[] array) {
        int soma = calcularSoma(array);
        return (double) soma / array.length;
    }


    public static double calcularMediana(int[] array) {
        Arrays.sort(array);
        int meio = array.length / 2;
        if (array.length % 2 == 0) {
            return (array[meio - 1] + array[meio]) / 2.0;
        } else {
            return array[meio];
        }
    }


    public static int calcularModa(int[] array) {
        Map<Integer, Integer> frequencia = new HashMap<>();
        for (int num : array) {
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
        }

        int moda = Integer.MIN_VALUE;
        int maxFrequencia = 1;
        boolean unicaModa = true;

        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            if (entry.getValue() > maxFrequencia) {
                maxFrequencia = entry.getValue();
                moda = entry.getKey();
                unicaModa = true;
            } else if (entry.getValue() == maxFrequencia) {
                unicaModa = false;
            }
        }

        return unicaModa ? moda : Integer.MIN_VALUE;
    }
}
