import vista.VistaRectangulo;
import controlador.ControladorRectangulo;

public class Main {

    public static void main(String[] args) {

        // Crear vista
        VistaRectangulo vista = new VistaRectangulo();

        // Crear controlador
        ControladorRectangulo controlador =
                new ControladorRectangulo(vista);

        // Iniciar programa
        controlador.iniciar();
    }
}
