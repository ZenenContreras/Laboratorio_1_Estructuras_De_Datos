/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MetodoVentas {
    Vector vVentas = new Vector();
    
    //Guardar datos en el vector 
    
    public void  guardar(Ventas unaVenta){
        vVentas.addElement(unaVenta);
        
        
    }
    
    //Guardar en un archivo txt
    public void  guardarArchivo(Ventas ventas){
        try{
            FileWriter fw= new FileWriter ("Alumnos.txt",true);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter pw = new PrintWriter (fw);
            pw.print(ventas.getNombreV());
            pw.print(";" + ventas.getCedulaV());
            pw.print(";" + ventas.getTipoDeAuto());
            pw.print(";" + ventas.getCodigoDelAuto());
            pw.print(";" + ventas.getMontoDeLaVenta());
            pw.close(); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }
    

    public DefaultTableModel listaVentas() {
        Vector cabeceras = new Vector();

        cabeceras.addElement("Nombre");
        cabeceras.addElement("CedulaV");
        cabeceras.addElement("TipoDeAuto");
        cabeceras.addElement("CodigoDelAuto");
        cabeceras.addElement("MontoDeLaVenta");

        DefaultTableModel VTabla = new DefaultTableModel(cabeceras, 0);

        try {
            FileReader fr = new FileReader("Alumnos.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;

            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, ";");
                Vector x = new Vector();
            
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
            
                VTabla.addRow(x);
            }
        
            br.close();
            fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
        return VTabla;
    }

}
