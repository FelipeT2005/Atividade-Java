import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho (número de linhas e colunas) da bandeira: ");
        int tamanho = scanner.nextInt();

        System.out.println("\nEscolha uma bandeira para desenhar:");
        System.out.println("1. Brasil");
        System.out.println("2. Alemanha");
        System.out.println("3. Argentina");
        System.out.println("4. Bélgica");
        System.out.println("5. Inglaterra");
        System.out.println("6. Coreia do Sul");
        System.out.println("7. EUA");
        System.out.println("8. Catar");
        System.out.println("9. Japão");
        System.out.print("Digite o número da bandeira: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                bandeiraBrasil(tamanho);
                break;
            case 2:
                bandeiraAlemanha(tamanho);
                break;
            case 3:
                bandeiraArgentina(tamanho);
                break;
            case 4:
                bandeiraBeligica(tamanho);
                break;
            case 5:
                bandeiraInglaterra(tamanho);
                break;
            case 6:
                bandeiraCoreiaDoSul(tamanho);
                break;
            case 7:
                bandeiraEUA(tamanho);
                break;
            case 8:
                bandeiraCatar(tamanho);
                break;
            case 9:
                bandeiraJapao(tamanho);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public static void bandeiraBrasil(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == n / 2) || (j == n / 2) || (i + j < n / 2) || (i + j > (n - 1) + n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print("&");
                }
            }
            System.out.println();
        }
    }

    public static void bandeiraAlemanha(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n / 3) {
                    System.out.print("*");
                } else if (i < (n * 2) / 3) {
                    System.out.print("&");
                } else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }

    public static void bandeiraArgentina(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n / 3 || i >= (2 * n) / 3) {
                    System.out.print("*");
                } else {
                    System.out.print("&");
                }
            }
            System.out.println();
        }
    }

    public static void bandeiraBeligica(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n / 3) {
                    System.out.print("*");
                } else if (j < (2 * n) / 3) {
                    System.out.print("&");
                } else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }

    public static void bandeiraInglaterra(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 || j == n / 2 || (i == j) || (i + j == n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print("&");
                }
            }
            System.out.println();
        }
    }

    public static void bandeiraCoreiaDoSul(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n / 3 || i >= (2 * n) / 3) {
                    System.out.print("%");
                } else {
                    if ((i + j) % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("&");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void bandeiraEUA(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n / 2) {
                    if (j < n / 3) {
                        System.out.print("*");
                    } else {
                        System.out.print("&");
                    }
                } else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }

    public static void bandeiraCatar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n / 3) {
                    System.out.print("*");
                } else {
                    System.out.print("&");
                }
            }
            System.out.println();
        }
    }

    public static void bandeiraJapao(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 && j == n / 2) {
                    System.out.print("%");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
