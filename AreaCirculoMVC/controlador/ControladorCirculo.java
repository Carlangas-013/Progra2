package controlador;

import modelo.ModeloCirculo;
import vista.VistaCirculo;

public class ControladorCirculo{
	private VistaCirculo vista;

	public ControladorCirculo(VistaCirculo vista){
		this.vista = vista;
	}

	//metodo principal
	public void iniciar(){
		//titulo
		vista.mostrarTitulo();
		//pedir datos
		double radio=vista.pedirRadio();
	
		//crear modelo
		ModeloCirculo circulo = new ModeloCirculo(radio);
		
		//obtener resultados
		double area = circulo.calcularArea();
		double perimetro= circulo.calcularPerimetro();
		
		//mostrar
		vista.mostrarResultados(area,perimetro);
	}
}
