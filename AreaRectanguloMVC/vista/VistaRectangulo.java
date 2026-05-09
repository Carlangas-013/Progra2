package vista;

import java.util.Scanner;

public class VistaRectangulo{
	private Scanner consola = new Scanner(System.in);
	//mostrar titulo
	public void mostrarTitulo(){
		System.out.println("=====ÁREA RECTANGULO====");

	}
	//pedir base
	public int pedirBase(){
		System.out.println("Base: ");
		return Integer.parseInt(consola.nextLine());
	}
	public int pedirAltura(){
		System.out.println("Altura: ");
		return Integer.parseInt(consola.nextLine());
	}
	public void mostrarResultados(int area, int perimetro){
		System.out.println("área: "+area);
		System.out.println("perimetro: "+perimetro);
	}
}
