package modelo;

public class ModeloTemperatura{
	private double gradosCelcius;
	//constructor
	public ModeloTemperatura(double gradosCelcius){
		this.gradosCelcius = gradosCelcius;
	}
	//modelos a calcular
	public double calcularGradosF(){
		return (gradosCelcius*1.8)+32;
	}
}
