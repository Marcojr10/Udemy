import java.util.Scanner;

public class notadosalunos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Informe a nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2 ;

        if(media >= 7.0){
            System.out.println("Sua média e: " + media +  "Aprovado, Parabens");
        } else if (media > 4.0){
            System.out.println("Sua média e: " + media + "Recuperação");
        } else{ System.out.println("Sua média e: "+ media + "Reprovado");
    }
        
        
        System.out.println("Obrigado");
            


    }

       
        
    


        
    }   
    
    

