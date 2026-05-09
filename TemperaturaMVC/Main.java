import vista.VistaTemperatura;
import controlador.ControladorTemperatura;

public class Main{

	public static void main(String[] args){

		VistaTemperatura vista = new VistaTemperatura();
		ControladorTemperatura controlador = new ControladorTemperatura(vista);
		controlador.iniciar();
	}
}
