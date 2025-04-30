import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();

        double x = Math.pow((a + b), 2);
        double igv = x * 0.19;
        double total = x + igv;

        System.out.println("Valor sin IGV: " + x);
        System.out.println("IGV (19%): " + igv);
        System.out.println("Total con IGV: " + total);
    }
}
