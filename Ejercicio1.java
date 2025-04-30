import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double numero = sc.nextDouble();
        double cuadrado = Math.pow(numero, 2);
        System.out.println("El cuadrado es: " + cuadrado);
    }
}
