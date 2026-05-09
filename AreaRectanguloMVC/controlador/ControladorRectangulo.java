package controlador;

import modelo.ModeloRectangulo;
import vista.VistaRectangulo;

public class ControladorRectangulo {

    private VistaRectangulo vista;

    // Constructor
    public ControladorRectangulo(VistaRectangulo vista) {
        this.vista = vista;
    }

    // Método principal
    public void iniciar() {

        // Mostrar título
        vista.mostrarTitulo();

        // Pedir datos
        int base = vista.pedirBase();
        int altura = vista.pedirAltura();

        // Crear el objeto  modelo
        ModeloRectangulo rectangulo = new ModeloRectangulo(base, altura);

        // Obtener resultados
        int area = rectangulo.calcularArea();
        int perimetro = rectangulo.calcularPerimetro();

        // Mostrar resultados
        vista.mostrarResultados(area, perimetro);
    }
}
