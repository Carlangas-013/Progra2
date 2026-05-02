import modelo.Calculadora;
import vista.VistaCalculadora;
import controlador.ControladorCalculadora;

public class Main {
    public static void main(String[] args) {

        Calculadora modelo = new Calculadora();
        VistaCalculadora vista = new VistaCalculadora();

        ControladorCalculadora controlador =
                new ControladorCalculadora(modelo, vista);

        controlador.iniciar();
    }
}
