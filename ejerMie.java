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
        int [][] matA;
        int [][] matB;
        int [][] matC;
        int [][] matInXTra;
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
        matA = new int[dime][dime];
        matB = new int[dime][dime];
        matC = new int[dime][dime];
        matInXTra = new int [dime][dime];
        numA = new Random();
        sumDP = 0;
        sumDS = 0;
        k = 0;
        cad1 = "";
        
        //salto de linea
        System.out.println("---------------------------------");
        
        //llenamos la matrix
        System.out.println("Llenamo la matriz A aleatoriamente");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA.length; j++) {
                matA [i][j] = numA.nextInt(100);//llenar matriz aleatoriamente
            }
        }
        
        //salto de linea
        System.out.println("---------------------------------");
        
        //imprimimos la matriz
        System.out.println("La matriz A es:");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA.length; j++) {
                System.out.print(matA[i][j] + " ");
            }
            //salto de linea
            System.out.println();
        }
        
        //linea
        System.out.println("---------------------------------");
        
        //suma de diagonales
        for (int i = 0; i < dime; i++) {
            sumDP = sumDP + matA[i][i];
            sumDS = sumDS + matA[i][dime - i - 1];
        }
        
        //imprimimos las sumas diagonales
        System.out.println("1.CUENTO SUMA LA DIAGONAL PRINCIPAL Y "
                + "LA SECUNDARIA:");
        System.out.println("La suma de la diagonal principal es:"+sumDP);
        System.out.println("La suma de la diagonal principal es:"+sumDS);
        
        //extremos
        if (k == 0) {
            for (int i = 0; i < dime; i++) {
                cad1 = cad1 + matA[k][i] + "\t";
            }
            k++;
            cad1 = cad1 + "\n";
        }

        if (k >= 1 && k <= dime - 1) {
            for (int i = 1; i < dime - 1; i++) {
                cad1 = cad1 + matA[i][0] + "" + matA[i][dime - 1] + "\n";
                k++;
            }
        }
        
        for (int i = 0; i < dime; i++) {
            cad1 = cad1 + matA[dime - 1][i];
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
                System.out.print(matA[i][0] + " ");
            }
            
            //linea
            System.out.println();

            for (int i = 0; i < dime; i++) {
                System.out.print(matA[i][dime - 1] + " ");
            }
            
            //linea
            System.out.println();

            for (int i = mitDia; i > 0; i--) {
                System.out.print(matA[i][i]);
            }
            
            //linea
            System.out.println();
            
            for (int i = mitDia; i > 0; i--) {
                System.out.print(matA[i][dime - 2] + " \n");
            }
            
            //linea
            System.out.println("---------------------------------");
            
            //elementos que forman la W
            System.out.println("Los elementos que forman la W:");
            for (int i = (dime - 1); i >= 0; i--) {
                System.out.print(matA[i][0] + " ");
            }
            
            //linea
            System.out.println();
            
            for (int i = (dime - 1); i >= 0; i--) {
                System.out.print(matA[i][dime - 1] + " ");//
            }
            
            //linea
            System.out.println();
            
            String cad2 = "";
            int j = 1;
            
            for (int i = dime - 2; i >= dime / 2; i--) {
                System.out.print(matA[i][i]);
                
                if (i != dime / 2) {
                    cad2 = cad2 + matA[i][j];
                    j++;
                }
            }
            
            System.out.print(cad2 + "\n");

        }else{
            System.out.println("Matriz par");
        }
        
        //linea
        System.out.println("---------------------------------");
        
        //llenamos la matrix
        System.out.println("4.LLENAR OTRA MATRIZ DE IGUAL TAMANO Y OBTENER "
                + "LA SUMA DE LAS DOS MATRICE Y LA INVERSA DE ESTA");
        System.out.println("Llenamo otra matriz B aleatoriamente");
        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB.length; j++) {
                matB [i][j] = numA.nextInt(100);//llenar matriz aleatoriamente
            }
        }
        
        //imprimir matrix b
        System.out.println("La matrix b es:");
        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB.length; j++) {
                System.out.print(matB[i][j] + " ");
            }
            //salto de linea
            System.out.println();
        }
        
        //linea
        System.out.println("---------------------------------");
        
        //sumammos las matrices
        for (int i = 0; i < dime; i++) {
            for (int j = 0; j < dime; j++) {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }
        
        //imprimir suma de matrices
        System.out.println("La matrix C producto de la suma de matrix A+B es:");
        for (int i = 0; i < dime; i++) {
            for (int j = 0; j < dime; j++) {
                System.out.print(matC[i][j] + " ");
            }
            //salto de linea
            System.out.println();
        }
        
        //linea
        System.out.println("---------------------------------");
        
        //inversa de matriz por metodo de transpuesta
        for(int i = 0; i < dime; i++){
            for(int j = 0; j < dime; j++){
                matInXTra[i][j]=matC[j][i];
            }
        }
        
        //imprimir inversa
        System.out.println("La inversa de la matriz c es:");
        for (int i = 0; i < dime; i++) {
            for (int j = 0; j < dime; j++) {
                System.out.print(matInXTra[i][j] + " ");
            }
            //salto de linea
            System.out.println();
        }
    }
}
