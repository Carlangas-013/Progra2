package controlador;

import modelo.Persona;
import vista.VistaPersona;

public class ControladorPersona {

    private Persona modelo;
    private VistaPersona vista;

    public ControladorPersona(Persona modelo, VistaPersona vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        vista.mostrarPersona(modelo.getNombre());
    }
}
