package ServidorPrincipal;

import Presentacion.Modelo;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import logica.ServidorHilo;
import logica.ServidorHilo;
public class Servidor {
    private Modelo miJuego;

    public Servidor() throws IOException, InterruptedException {
        miJuego = new Modelo();        
        miJuego.iniciar();
    }
    public static void main(String args[]) throws IOException, InterruptedException {        
      new Servidor();
    }
}
