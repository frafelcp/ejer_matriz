/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promMa;

//Dada una matrix cuadrada mxm obtener

import java.util.Random;
import java.util.Scanner;

//1.cuanto suma la diagonal principal y la secundaria
//2.mostrar los datos de los extremos sin repetirlos
//3.mostrar los datos que forman la m y la w si la matrix es impar
//4.llenar otra matriz de igual tamano y obtener la suma de las dos matrices y
//obtener la matriz inversa de esta y mostrar el dato que mas repite por fila

/**
 *
 * @Felix castro
 */
public class ejerMie {
    public static void main(String[] args) {
        //consola
        Scanner leer = new Scanner(System.in);
        
        //definimos variables, contadores, acumuladores y arrays
        int [][] mat;
        int dime;//variable dimension mxm=dimexdime
        Random numA;//variable tipo ramdon
        int sumDP;//variable suma diagonal principal
        int sumDS;//variable suma diagonal secundaria
        int k;
        String cad1;
        
        //titulo
        System.out.println("EJERCICIO");
        
        //salto de linea
        System.out.println("---------------------------------");
        
        //solicitamos la dimension de la matriz
        System.out.println("Ingrese la dimension de la matrix de mxm");
        dime = leer.nextInt();
        
        //inicializamos las variables, contadores, acumuladores
        mat = new int[dime][dime];
        numA = new Random();
        sumDP = 0;
        sumDS = 0;
        k = 0;
        cad1 = "";
        int [] w1;
        
        //salto de linea
        System.out.println("---------------------------------");
        
        //llenamos la matrix
        System.out.println("Llenamo la matriz aleatoriamente");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat [i][j] = numA.nextInt(100);//llenar matriz aleatoriamente
            }
        }
        
        //salto de linea
        System.out.println("---------------------------------");
        
        //imprimimos la matriz
        System.out.println("La matriz es:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            //salto de linea
            System.out.println();
        }
        
        //linea
        System.out.println("---------------------------------");
        
        //suma de diagonales
        for (int i = 0; i < dime; i++) {
            sumDP = sumDP + mat[i][i];
            sumDS = sumDS + mat[i][dime - i - 1];
        }
        
        //imprimimos las sumas diagonales
        System.out.println("1.CUENTO SUMA LA DIAGONAL PRINCIPAL Y "
                + "LA SECUNDARIA:");
        System.out.println("La suma de la diagonal principal es:"+sumDP);
        System.out.println("La suma de la diagonal principal es:"+sumDS);
        
        //extremos
        if (k == 0) {
            for (int i = 0; i < dime; i++) {
                cad1 = cad1 + mat[k][i] + "\t";
            }
            k++;
            cad1 = cad1 + "\n";
        }

        if (k >= 1 && k <= dime - 1) {
            for (int i = 1; i < dime - 1; i++) {
                cad1 = cad1 + mat[i][0] + "" + mat[i][dime - 1] + "\n";
                k++;
            }
        }
        
        for (int i = 0; i < dime; i++) {
            cad1 = cad1 + mat[dime - 1][i];
        }
        
        //linea
        System.out.println("---------------------------------");
        
        System.out.println("2.MOSTRAR LOS DATOS DE LOS EXTREMOS SIN REPETIRLOS:");
        System.out.println(cad1);
        
        //linea
        System.out.println("---------------------------------");
        
        //matriz impar mostrar m y w 
        System.out.println("3.MOSTRAR LOS DATOS QUE FORMAN LA M Y"
                + " LA W SI LA MATRIZ ES IMPAR");
        if (dime % 2 != 0) {//si es impar
            int mitDia = (dime - 1)/ 2;
            //Elementos que forman la M
            System.out.println("Los elementos que forman la M son:");
            for (int i = 0; i < dime; i++) {
                System.out.println(mat[i][0] + "");
            }
            
            //linea
            System.out.println();

            for (int i = 0; i < dime; i++) {
                System.out.println(mat[i][dime - 1] + " ");
            }
            
            //linea
            System.out.println();

            for (int i = mitDia; i > 0; i--) {
                System.out.println(mat[i][i]);
            }
            
            //linea
            System.out.println();
            
            for (int i = mitDia; i > 0; i--) {
                System.out.println(mat[i][dime - 2] + " ");
            }
            
            //linea
            System.out.println("---------------------------------");
            
            //elementos que forman la W
            System.out.println("Los elementos que forman la W:");
            for (int i = (dime - 1); i >= 0; i--) {
                System.out.println(mat[i][0]);
            }
            
            //linea
            System.out.println();
            
            for (int i = (dime - 1); i >= 0; i--) {
                System.out.println(mat[i][dime - 1]);//
            }
            
            //linea
            System.out.println();
            
            String cad2 = "";
            int j = 1;
            
            for (int i = dime - 2; i >= dime / 2; i--) {
                System.out.println(mat[i][i]);
                
                if (i != dime / 2) {
                    cad2 = cad2 + mat[i][j];
                    j++;
                }
            }
            
            System.out.println(cad2);

        }else{
            System.out.println("Matriz par");
        }
    }
}
