import modelo.Persona;
import vista.VistaPersona;
import controlador.ControladorPersona;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Carlos", 20);
        VistaPersona vista = new VistaPersona();

        ControladorPersona controlador = new ControladorPersona(persona, vista);

        controlador.iniciar();
    }
}
