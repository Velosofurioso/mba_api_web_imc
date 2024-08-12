import java.util.Scanner;
 
public class IMC {

    public final static double MIN_WEIGHT = 18.5;
    public final static double MEDIUM_WEIGHT = 24.9;
    public final static double MAX_WEIGHT = 29.9;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite seu peso (kg): ");
        final double weight = scanner.nextDouble();
 
        System.out.print("Digite sua altura (m): ");
        final double height = scanner.nextDouble();

        final double imc = weight / (height * height);
        System.out.printf("Seu IMC: %.2f%n", imc);


        if (imc < MIN_WEIGHT) 
            System.out.println("Voce esta abaixo do peso.");
        
        else if (imc >= MIN_WEIGHT && imc < MEDIUM_WEIGHT) 
            System.out.println("Voce esta com peso normal.");

        else if (imc >= MEDIUM_WEIGHT && imc < MAX_WEIGHT)
            System.out.println("Voce esta com sobrepeso.");

        else
            System.out.println("Voce esta com obesidade.");
 
        scanner.close();
    }
}