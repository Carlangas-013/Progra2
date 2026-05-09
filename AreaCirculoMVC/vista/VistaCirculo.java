package vista;

import java.util.Scanner;

public class VistaCirculo{
	private Scanner consola = new Scanner(System.in);
	//mostrar titulo
	public void mostrarTitulo(){
		System.out.println("*=== CALCULADORA ÁREA CIRCUNFERENCIA ===*");
	}
	//pedir datos 
	public double pedirRadio(){
		System.out.print("digita Radio: ");
		return Double.parseDouble(consola.nextLine());
	}
	//mostrar resultado
	public void mostrarResultados(double area, double perimetro){
		System.out.println("Área: "+ area);
		System.out.println("Perímetro: "+perimetro);
	}
}
