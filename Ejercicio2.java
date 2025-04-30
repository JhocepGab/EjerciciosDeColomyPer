import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        double num3 = sc.nextDouble();

        double media = (num1 + num2 + num3) / 3;
        System.out.println("La media es: " + media);
    }
}
