import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em celcius ");
        double celcius = scanner.nextDouble();

        double conversao =  celcius * 1.8 + 32;

        System.out.println("valor de Fahrenheit?" + conversao);
        
        scanner.close();

    


    }
    
}
