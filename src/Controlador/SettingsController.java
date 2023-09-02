/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.System_Vista;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SettingsController implements MouseListener{
    
    private System_Vista views;
    
    public SettingsController(System_Vista views){
        this.views = views ; 
        this.views.jLabelEmpleados.addMouseListener(this);
        this.views.jLabelIconoEmpleados.addMouseListener(this);
        this.views.jLabelVentas.addMouseListener(this);
        this.views.jLabelIconoVentas.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        if (e.getSource()== views.jLabelEmpleados){
            views.jPanelEmpleados.setBackground(new Color (152,202,63));
        }else if(e.getSource()== views.jLabelIconoEmpleados){
            views.jPanelEmpleados.setBackground(new Color (152,202,63));
        }else if(e.getSource()== views.jLabelVentas){
            views.jPanelVentas.setBackground(new Color (152,202,63));
        }else if(e.getSource()== views.jLabelIconoVentas){
            views.jPanelVentas.setBackground(new Color (152,202,63));
        }
        
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()== views.jLabelEmpleados){
            views.jPanelEmpleados.setBackground(new Color (18,45,61));
        }else if(e.getSource()== views.jLabelIconoEmpleados){
            views.jPanelEmpleados.setBackground(new Color (18,45,61));
        }else if(e.getSource()== views.jLabelVentas){
            views.jPanelVentas.setBackground(new Color (18,45,61));
        }else if(e.getSource()== views.jLabelIconoVentas){
            views.jPanelVentas.setBackground(new Color (18,45,61));
        }
        
        
        
    }
    
    
    
}
