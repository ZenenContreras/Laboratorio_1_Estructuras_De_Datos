
package Main;


import Vista.Login_Vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //Instancia del login para que sea la primera ventana en abrirse
        
        Login_Vista login = new Login_Vista();
        
        login.setVisible(true); 
        
        File archivo = new File("test/ventas.txt");
        try {
            archivo.createNewFile();
        } catch (IOException e) {
        }
        //
        
    }
    
    
    
//    // CON ESTE METODO RE-ESCRIBIMOS UN ARCHIVO. Le enviamos el archivo a re-escribir y el "texto (registros)" con los que deseamos reescribir el archivo
//    public static void write(String nombre, String texto) {
//        File archivo = new File("test/ventas.txt");
//        try (BufferedWriter bf = new BufferedWriter(new FileWriter(archivo))) {
//            bf.write(texto);
//        } catch (IOException e) {
//            System.out.println("Error");
//        }
//    } 
//
//    public static String read(String nombre) {
//        File archivo = new File("test/" + nombre);
//        try (BufferedReader bf = new BufferedReader(new FileReader(archivo))) {
//            String texto = "";
//            String linea;
//            while ((linea = bf.readLine()) != null) {
//                texto += linea + "\n";
//            }
//
//            return texto;
//        } catch (IOException e) {
//            System.out.println("Error");
//            return null;
//        }
//    }
//        
//    public static String[][] getArray(String nombre) {
//        String texto = read(nombre);
//
//        String[] lineas = texto.split("\n");
//        String[][] matriz = new String[lineas.length][lineas[0].split(";").length];
//
//        for (int i = 0; i < lineas.length; i++) {
//            String[] columnas = lineas[i].split(";");
//            for (int j = 0; j < columnas.length; j++) {
//                matriz[i][j] = columnas[j];
//            }
//        }
//
//        return matriz;
//    }
//
//    public static String getText(String[][] array) {
//        String texto = "";
//        for (int i = 0; i < array.length; i++) {
//            String linea = array[i][0];
//            for (int j = 1; j < array[i].length; j++) {
//                linea += ";" + array[i][j];
//            }
//            texto += linea + "\n";
//        }
//        return texto;
//    }
//
//    public static void imprimirMatriz(String[][] matriz) {
//        for (int i = 0; i < matriz.length; i++) {
//            System.out.println(Arrays.toString(matriz[i]));
//        }
//    }
        
        
  }    
       

    
