import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura de Fahrenheit ");
        double Fahrenheit = scanner.nextDouble();

        double conversao = (Fahrenheit - 1.8) / 32;

        System.out.println("O valor de celsius e?" + conversao);

        scanner.close();

    }
    
}
