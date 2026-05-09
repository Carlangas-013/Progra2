package vista;

import java.util.Scanner;

public class VistaTemperatura{

	private Scanner consola = new Scanner(System.in);

	//titulo
	public void mostrarTitulo(){
		System.out.println("-- CONVERTIR GRADOS ºC -> ºF --");

	}
	//pedir dato
	public double pedirgradosCelcius(){
		System.out.print("Digite ºC: ");
		return Double.parseDouble(consola.nextLine());
	}
	//mostrar resultado
	public void mostrarResultados(double gradosF){
		System.out.println("ºF = "+ gradosF);
	}
}
