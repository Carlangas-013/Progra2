package controlador;

import modelo.Calculadora;
import vista.VistaCalculadora;

public class ControladorCalculadora {

    private Calculadora modelo;
    private VistaCalculadora vista;

    public ControladorCalculadora(Calculadora modelo, VistaCalculadora vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            if (opcion >= 1 && opcion <= 3) {
                double a = vista.pedirNumero("Ingrese primer número: ");
                double b = vista.pedirNumero("Ingrese segundo número: ");

                double resultado = 0;

                switch (opcion) {
                    case 1:
                        resultado = modelo.sumar(a, b);
                        break;
                    case 2:
                        resultado = modelo.restar(a, b);
                        break;
                    case 3:
                        resultado = modelo.multiplicar(a, b);
                        break;
                }

                vista.mostrarResultado(resultado);

            } else if (opcion != 4) {
                vista.mostrarMensaje("Opción inválida");
            }

        } while (opcion != 4);

        vista.mostrarMensaje("Gracias por usar la calculadora");
    }
}
