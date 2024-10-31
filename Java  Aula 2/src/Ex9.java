import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] produtos = new String[10]; 
        int[] quantidades = new int[10];     
        int contadorProdutos = 0;            

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Consultar quantidade de um produto");
            System.out.println("3. Atualizar estoque de um produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    if (contadorProdutos < produtos.length) {
                        cadastrarProduto(produtos, quantidades, contadorProdutos, scanner);
                        contadorProdutos++;
                    } else {
                        System.out.println("Limite de produtos cadastrados atingido.");
                    }
                    break;

                case 2:
                    consultarProduto(produtos, quantidades, contadorProdutos, scanner);
                    break;

                case 3:
                    atualizarEstoque(quantidades, contadorProdutos, scanner);
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void cadastrarProduto(String[] produtos, int[] quantidades, int contador, Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        produtos[contador] = scanner.nextLine();

        System.out.print("Digite a quantidade em estoque: ");
        quantidades[contador] = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Produto cadastrado com sucesso!");
    }

    public static void consultarProduto(String[] produtos, int[] quantidades, int contador, Scanner scanner) {
        System.out.print("Digite o nome do produto para consulta: ");
        String nomeProduto = scanner.nextLine();
        
        for (int i = 0; i < contador; i++) {
            if (produtos[i].equalsIgnoreCase(nomeProduto)) {
                System.out.println("Quantidade em estoque de " + produtos[i] + ": " + quantidades[i]);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void atualizarEstoque(int[] quantidades, int contador, Scanner scanner) {
        System.out.print("Digite o nome do produto para atualizar o estoque: ");
        String nomeProduto = scanner.nextLine();
        
        for (int i = 0; i < contador; i++) {
            if (produtos[i].equalsIgnoreCase(nomeProduto)) {
                System.out.print("Digite a quantidade a adicionar ou remover (use número negativo para remover): ");
                int quantidadeAtualizar = scanner.nextInt();
                quantidades[i] += quantidadeAtualizar; // Atualiza a quantidade
                System.out.println("Estoque atualizado. Nova quantidade: " + quantidades[i]);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
