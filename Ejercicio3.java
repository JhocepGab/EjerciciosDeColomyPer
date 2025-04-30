import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("La solucion doble es: x = " + x);
        } else {
            System.out.println("La ecuacion no tiene soluciones reales.");
        }
    }
}
