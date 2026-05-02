package vista;

import java.util.Scanner;

public class VistaCalculadora {

    private Scanner sc = new Scanner(System.in);

    public double pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public int mostrarMenu() {
        System.out.println("\n=== CALCULADORA ===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        return sc.nextInt();
    }

    public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
