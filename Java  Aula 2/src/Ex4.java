import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Informe o número de dependentes: ");
        int dependentes = scanner.nextInt();

        System.out.print("Informe o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        System.out.print("Informe a taxa de imposto normal que já foi paga pelo funcionário: ");
        double impostoPago = scanner.nextDouble();

        double numeroSalariosMinimos = salarioFuncionario / salarioMinimo;
        double impostoBruto = 0.0;

        if (numeroSalariosMinimos > 12) {
            impostoBruto = salarioFuncionario * 0.20;
        } else if (numeroSalariosMinimos > 5) {
            impostoBruto = salarioFuncionario * 0.08;
        } else {
            impostoBruto = 0.0;
        }

        double taxaAdicional = impostoBruto * 0.04;
        impostoBruto += taxaAdicional;

        double descontoDependentes = impostoBruto * (dependentes * 0.02);
        double impostoFinal = impostoBruto - descontoDependentes - impostoPago;

        if (impostoFinal < 0) {
            impostoFinal = 0;
        }

        System.out.printf("Imposto de renda a ser pago: R$ %.2f%n", impostoFinal);

        scanner.close();
    }
}

