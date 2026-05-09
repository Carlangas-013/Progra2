package controlador;

import vista.VistaTemperatura;
import modelo.ModeloTemperatura;

public class ControladorTemperatura{
	private VistaTemperatura vista;
	
	public ControladorTemperatura(VistaTemperatura vista){
		this.vista = vista;
	}
	public void iniciar(){
		vista.mostrarTitulo();
		double gradosCelcius= vista.pedirgradosCelcius();
		
		ModeloTemperatura temperatura = new ModeloTemperatura(gradosCelcius);
		double gradosF = temperatura.calcularGradosF();
		
		vista.mostrarResultados(gradosF);
	}
}
