import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        double valorHora = input.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        double horasTrabalhadas = input.nextDouble();

        double salarioMes = valorHora * horasTrabalhadas;

        System.out.printf("Seu salário este mês será R$%.2f", salarioMes);
        input.close();
    }
}
