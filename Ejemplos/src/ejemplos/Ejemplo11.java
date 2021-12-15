/*
    Estudiante:Luis - M1:8.1 M2:7.9 PROM: 8,0000
    Estudiante:Ana - promedio final: 9,1000
    Estudiante:Mónica - promedio final: 9,6000
    Estudiante:José - promedio final: 9,9000
    Estudiante:Juan - promedio final: 9,8000
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        
        // Se declara un arreglo de tipo double, llamado promedios
        double[] promediosMateria1 = {8.1, 9, 9.5, 10, 9.9};
        double[] promediosMateria2 = {7.9, 9.2, 9.7, 9.8, 9.7};
        String[] estudiantes = {"Luis", "Ana", "Mónica", "José", "Juan"};
        double[] promediosFinales = new double[5];
        
        double sumaNotas;
        double promedio;
        
        String mensajeFinal = ""; // variable que acumula un reporte final
        // Se hace uso del ciclo repetitivo for para recorrer los arreglos
        // y presentar los valore de las posiciones
        
        for (int i = 0; i < promediosFinales.length; i++) {
            // se suma el valor de la posición i del arreglo 
            // promediosMateria1 y promediosMateria2
            sumaNotas = promediosMateria1[i] + promediosMateria2[i];
            // se obtiene el promedio de la suma de las notas
            promedio = sumaNotas / 2;
            // se asigna a la posición i del arreglo promediosFinales
            promediosFinales[i] = promedio;
        }
        
        for (int i = 0; i < promediosMateria1.length; i++) { 
            
            mensajeFinal = String.format("%sEstudiante:%s - promedio final: "
                    + "%.4f\n", 
                    mensajeFinal,
                    estudiantes[i],
                    promediosFinales[i]);
        }
        
        System.out.printf("%s\n", mensajeFinal);
        
    }

}
