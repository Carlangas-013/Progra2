import modelo.Persona;
import vista.VistaPersona;
import controlador.ControladorPersona;

public class Main {

    public static void main(String[] args) {

        Persona modelo = new Persona();
        VistaPersona vista = new VistaPersona();

        ControladorPersona controlador = new ControladorPersona(modelo, vista);

        controlador.iniciar();
    }
}
