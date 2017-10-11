/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Estudiantes
 */
public class Controlador implements ActionListener, MouseMotionListener, MouseListener{
    private final Vista ventana;
    public Controlador(Vista aThis) {
        ventana = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        System.out.println("entro boton Salir");
        if(boton.equals(ventana.getBtnsalir())){
           // ventana.getModelo().FinalizarHilo();
           int Sesion=Integer.parseInt(ventana.Obtenerid());
    
           ventana.getModelo().RetornarHilo(Sesion);
            System.out.println("entro boton Salir");
        }else if(boton.equals(ventana.getBtnEnviar())){
            int Sesion=Integer.parseInt(ventana.Obtenerid());
            System.out.print("Entro boton Enviar");
            try {
                ventana.getModelo().enviardatoscliente(ventana.getCheckRojoL1().isSelected(),ventana.getCheckAmarilloL1().isSelected(),ventana.getCheckVerdeL1().isSelected(),ventana.getIntermitenciaL1().isSelected(),ventana.getCheckRojoL2().isSelected(),ventana.getCheckAmarilloL2().isSelected(),ventana.getCheckVerdeL2().isSelected(),ventana.getIntermitenciaL2().isSelected(),Sesion);
            } catch (InterruptedException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.print("Hola");
        }else{
            //ventana.getModelo().terminar();
        }


    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
