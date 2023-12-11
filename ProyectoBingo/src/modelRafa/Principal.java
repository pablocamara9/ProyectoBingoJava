package modelRafa;

import java.util.Arrays;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int[][] carton = new int[3][9];
        
        // Rellenar numeros en el carton
        // Ordena cada columna del carton
        // Marca los huecos del cartón
        // Mostramos el cartón
 
    }
 
    public static int generaNumeroAleatorio(int minimo, int maximo) {
    	int numGenerado;
    	Random rnd = new Random(System.nanoTime());
    	
        numGenerado = rnd.nextInt(maximo - minimo + 1) + minimo;
        return numGenerado;
    }
    
    public static void rellenarNumerosCarton(int[][] carton) {
    	 
        // Declaramos las variables necesarias
        int numAleatorio;
        boolean repetido;
     
        // Recorre los números
        for (int j = 0; j < carton[0].length; j++) {
            for (int i = 0; i < carton.length; i++) {
                do {
                    repetido = false;
                    // Genera un número aleatorio
                    // En la columna 0, el numero estará entre 1 y 9
                    // Entre las columnas 1 y 7, el numero estará entre (10 * j) y ((10 * j) + 9)
                    // En la columna 8, el numero estará entre 80 y 90
                    switch (j) {
                        case 0:
                            numAleatorio = generaNumeroAleatorio(1, 9);
                            break;
                        case 8:
                            numAleatorio = generaNumeroAleatorio(80, 90);
                            break;
                        default:
                            numAleatorio = generaNumeroAleatorio(10 * j, (10 * j) + 9);
                            break;
                    }
     
                    // Se puede hacer con un bucle
                    // Comprobamos si se repite el primero
                    if (i == 1 && carton[0][j] == numAleatorio) {
                        repetido = true;
                        // Comprobamos si se repite el primero o el segungo
                    } else if (i == 2 && (carton[0][j] == numAleatorio || carton[1][j] == numAleatorio)) {
                        repetido = true;
                    }
     
                } while (repetido);
     
                // Añadimos el número
                carton[i][j] = numAleatorio;
            }
        }
    }
    
    public static void ordenarColumnasCarton(int[][] carton) {
    	 
        int[] numeros = new int[3];
        for (int j = 0; j < carton[0].length; j++) {
     
            // Obtengo los numeros de la columna x
            for (int i = 0; i < carton.length; i++) {
                numeros[i] = carton[i][j];
            }
     
            // Ordeno los numeros
            Arrays.sort(numeros);
     
            // Vuelvo a asignar los valores, ya ordenados
            for (int i = 0; i < numeros.length; i++) {
                carton[i][j] = numeros[i];
            }
     
        }
    }
    
    
    public static void mostrarCarton(int[][] carton) {
    	 
        // Recorremos el carton
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
     
                // Si es -1, ponemos un * o **, segun la columna
                if (carton[i][j] == -1) {
                    // Si es la primera columna, pongo un * y sino pongo 2 *
                    if (j == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("** ");
                    }
     
                } else {
                    // Muestro el valor tal cual
                    System.out.print(carton[i][j] + " ");
                }
            }
            // Salto de linea
            System.out.println("");
        }
    }
    
    
    
    
    
    
}
		
		
		
		
		
