/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Presentacion.Vista;

/**
 *
 * @author Estudiantes
 */
public class Clientes {
     private int idSession;
      private Vista frame;
      private int linea1v, linea1r, linea1a, linea2v, linea2r, linea2a;            

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public Vista getFrame() {
        return frame;
    }

    public void setFrame(Vista frame) {
        this.frame = frame;
    }

    public int getLinea1v() {
        return linea1v;
    }

    public void setLinea1v(int linea1v) {
        this.linea1v = linea1v;
    }

    public int getLinea1r() {
        return linea1r;
    }

    public void setLinea1r(int linea1r) {
        this.linea1r = linea1r;
    }

    public int getLinea1a() {
        return linea1a;
    }

    public void setLinea1a(int linea1a) {
        this.linea1a = linea1a;
    }

    public int getLinea2v() {
        return linea2v;
    }

    public void setLinea2v(int linea2v) {
        this.linea2v = linea2v;
    }

    public int getLinea2r() {
        return linea2r;
    }

    public void setLinea2r(int linea2r) {
        this.linea2r = linea2r;
    }

    public int getLinea2a() {
        return linea2a;
    }

    public void setLinea2a(int linea2a) {
        this.linea2a = linea2a;
    }
    
          
private boolean estaMoviendose;
     public boolean isEstaMoviendose() {
        return estaMoviendose;
    }
    public void setEstaMoviendose(boolean estaMoviendose) {
        this.estaMoviendose = estaMoviendose;
    }
}
