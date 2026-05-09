import vista.VistaCirculo;
import controlador.ControladorCirculo;

public class Main{
	public static void main(String[] args){
		VistaCirculo vista= new VistaCirculo();
		ControladorCirculo controlador = new ControladorCirculo(vista);
		controlador.iniciar();
	}
}
