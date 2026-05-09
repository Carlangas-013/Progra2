package modelo;
public class ModeloCirculo{
	//datos
	private double radio;
	//constructor
	public ModeloCirculo(double radio){
		this.radio = radio;
	}
	//metodos para calcular
	public double calcularArea(){
		return Math.PI*radio*radio;
	}
	public double calcularPerimetro(){
		return 2*Math.PI*radio;
	}
}
