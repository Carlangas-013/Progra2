package modelo;

public class ModeloRectangulo{
	//atributos o datos
	private int base;
	private int altura;
	//constructor
	public ModeloRectangulo(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	//metodos para calcular area
	public int calcularArea(){
		return base*altura;
	}
	public int calcularPerimetro(){
		return (base+altura)*2;
	}

}
