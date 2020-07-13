import java.util.Scanner;

public class ConverteCelsiusParaFahrenheit {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double celsius;
        char oUsuarioDesejaRepetirAConversao;
        System.out.println("Conversor de Celsius para Fahrenheit");
        do {
            System.out.println("Digite a temperatura em Celsius:");
            celsius = scanner.nextDouble();
            System.out.printf("Equivalente em Fahrenheit: %.1f%nDeseja repetir?", converterParaFahrenheit(celsius));
            oUsuarioDesejaRepetirAConversao = scanner.next().charAt(0);
        } while (oUsuarioDesejaRepetirAConversao != 'n');
    }

    private static double converterParaFahrenheit(double celsius) {
        return (9.0 * celsius / 5.0 + 32.0);
    }

}