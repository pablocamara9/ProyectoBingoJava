package model;

import java.util.Arrays;

public class Carton {
	
	//Atributos
	private Casilla [][] carton;
	
	//Constructores
	public Carton(Casilla[][] carton) {
		this.carton = carton;
	}
	
	//Getters y setters
	public Casilla[][] getCarton() {
		return carton;
	}
	public void setCarton(Casilla[][] carton) {
		this.carton = carton;
	}
	
	//toString
	public String toString() {
		return "Carton [carton=" + Arrays.toString(carton) + "]";
	}
	
	//Métodos
	public void rellenarCarton() {
		for (int j = 0; j < carton.length; j++) {
			for (int i = 0; i < carton.length; i++) {
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
