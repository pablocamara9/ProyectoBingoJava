package model;

import java.util.Random;

public class MainDePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd= new Random(System.nanoTime());
		
		int [][] arrPrueba = new int [9][3];
		int desde = 1, hasta = 9;
		
		//Rellenar
		for (int j = 0; j < arrPrueba.length; j++) {
			for (int i = 0; i < arrPrueba[j].length; i++) {
				arrPrueba[j][i]=rnd.nextInt(hasta-desde+1)+desde;
			}
		}
		
		//Mostrar
		for (int j = 0; j < arrPrueba.length; j++) {
			//System.out.print("");
			for (int i = 0; i < arrPrueba[j].length; i++) {
				System.out.println(arrPrueba[j][i] + "\t");
			}
			
		}

	}

}
