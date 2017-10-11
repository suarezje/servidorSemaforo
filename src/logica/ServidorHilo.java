/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Presentacion.Vista;
import Presentacion.Modelo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.ls.DOMImplementationLS;

/**
 *
 * @author Estudiantes
 */
public class ServidorHilo extends Thread {
    private Socket socket;
    private DataOutputStream datosSalida;
    private DataInputStream datosEntrada;
    private int idSession;
    private String cadenaComando, ipCliente;
    private String [] datos, arrayIdSession;
    private Vista frame;
    private boolean estaMoviendose, existe=true;
    private int SemaforoLinea1, SemaforoLinea2;
    private String [] cuerpo1, cuerpo2, lineas; 
    private Clientes  cliente; 
    private ServidorHilo hilooriginal;

    
    private String nDanadosRL1,nDanadosAL1,nDanadosVL1,nDanadosRL2,nDanadosAL2,nDanadosVL2;

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
   
    public ServidorHilo() {
        idSession=0;
    }
    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }
   

    public Vista getFrame() {
        return frame;
    }

    public void setFrame(Vista frame) {
        this.frame = frame;
    }
    ArrayList<Vista> listaformularios = new ArrayList<Vista>();

    public ArrayList<Vista> getListaformularios() {
        return listaformularios;
    }

    public String getIpCliente() {
        return ipCliente;
    }

    public void setIpCliente(String ipCliente) {
        this.ipCliente = ipCliente;
    }

    public void setListaformularios(ArrayList<Vista> listaformularios) {
        this.listaformularios = listaformularios;
    }

    public ServidorHilo(Socket socket){        
        this.socket = socket;         
        try {
            datosSalida = new DataOutputStream(socket.getOutputStream());
            datosEntrada = new DataInputStream(socket.getInputStream());
            
            //Se divide la cadena de entrada para tomar el idsession
            cadenaComando = datosEntrada.readUTF();
            datos=cadenaComando.split("\\|");
            arrayIdSession=datos[1].split(":");
            setIdSession(Integer.parseInt(arrayIdSession[0]));
            nDanadosRL1="0";
            nDanadosAL1="0";
            nDanadosVL1="0";
            nDanadosRL2="0";
            nDanadosAL2="0";
            nDanadosVL2="0";
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void desconnectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void run() {        
               
        try {                      
            
            while(true){ 
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
                }
                String encabezado = datos[0];
                if(socket.isClosed()){
                    //"Se cerro el hilo pendiente validar si hay que cerrar el socket"
                }else {ValidaComando(0, 0);}
                
            }
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        desconnectar();
    }

    public void setDatosSalida(String valor) throws IOException {
        this.datosSalida.writeUTF(valor);
        datosSalida.flush();        
    }
    
    public int getIdSession() {
        return idSession;
    }
     public void setIdSession(int idSession) {
        this.idSession = idSession;
    }
     
    public void ValidaComando(int SemLinea1,int SemLinea2) throws IOException, InterruptedException
    {
        String encabezado = datos[0];
        
        System.out.println("existe:"+encabezado);
        
                  switch (encabezado){
                    case "C" :
                     if(existe){ 
                         
                        
                 //   System.out.println("El cliente con idSesion "+this.idSession+" saluda");
                    String [] cantSemaforos=arrayIdSession[1].split(",");
                    SemaforoLinea1 =    Integer.parseInt(cantSemaforos[0]);
                    SemaforoLinea2 =    Integer.parseInt(cantSemaforos[1]);
                    //Implementar reporte
                    //System.out.println(this.idSession+ " Semaforos linea 1:" + SemaforoLinea1 + " Semaforos linea 2:" + SemaforoLinea2);
                    //frame.setCantL1(SemaforoLinea1);
                    //frame.setCantL2(SemaforoLinea2);
                    datosSalida.writeUTF("R|" + this.idSession);
                    Enviarinstruccione   onj = new Enviarinstruccione();
        
                        onj.CrearCliente(ipCliente,"");
                    //datosSalida.flush();
                     }
                     else
                     {   
                         System.out.println("Ingreso C X"); 
                         this.datosSalida.writeUTF("X");
                         this.datosSalida.flush();
                         desconnectar();
                     }
                    break;

                    case "B":
                    
                    lineas = arrayIdSession[1].split("-");
                    cuerpo1 = lineas[0].split(",");
                    cuerpo2 = lineas[1].split(",");
                    
                    
                    this.getHilooriginal().setnDanadosRL1(String.valueOf(SemLinea1- Integer.parseInt(cuerpo1[0])));
                    this.getHilooriginal().setnDanadosAL1(String.valueOf(SemLinea1- Integer.parseInt(cuerpo1[1])));
                    this.getHilooriginal().setnDanadosVL1(String.valueOf(SemLinea1- Integer.parseInt(cuerpo1[2])));
                    this.getHilooriginal().setnDanadosRL2(String.valueOf(SemLinea2- Integer.parseInt(cuerpo1[0])));
                    this.getHilooriginal().setnDanadosAL2(String.valueOf(SemLinea2- Integer.parseInt(cuerpo1[1])));
                    this.getHilooriginal().setnDanadosVL2(String.valueOf(SemLinea2- Integer.parseInt(cuerpo1[2])));
                    System.out.print("Datos que quiere vanessa "+ nDanadosRL1+"                              posicion 1    ");                    
                    //int amarillos=Integer.parseInt(cuerpo1[0]); 
                    //cliente.setLinea1a(amarillos);
                    //int Verdes=Integer.parseInt(cuerpo1[0]); 
                    // cliente.setLinea1a(Verdes);
                    
                    System.out.println(cuerpo1[0] + cuerpo1[1] + cuerpo1[2]);
                    System.out.println(cuerpo2[0] + cuerpo2[1] + cuerpo2[2]);                    
                    datosSalida.writeUTF("S|" + this.idSession);
                    break;
                        }
    }

    public int getSemaforoLinea1() {
        return SemaforoLinea1;
    }

    public void setSemaforoLinea1(int SemaforoLinea1) {
        this.SemaforoLinea1 = SemaforoLinea1;
    }

    public int getSemaforoLinea2() {
        return SemaforoLinea2;
    }

    public void setSemaforoLinea2(int SemaforoLinea2) {
        this.SemaforoLinea2 = SemaforoLinea2;
    }

    public String getnDanadosRL1() {
        return nDanadosRL1;
    }

    public String getnDanadosAL1() {
        return nDanadosAL1;
    }

    public String getnDanadosVL1() {
        return nDanadosVL1;
    }

    public String getnDanadosRL2() {
        return nDanadosRL2;
    }

    public String getnDanadosAL2() {
        return nDanadosAL2;
    }

    public String getnDanadosVL2() {
        return nDanadosVL2;
    }

    public void setnDanadosRL1(String nDanadosRL1) {
        this.nDanadosRL1 = nDanadosRL1;
    }

    public void setnDanadosAL1(String nDanadosAL1) {
        this.nDanadosAL1 = nDanadosAL1;
    }

    public void setnDanadosVL1(String nDanadosVL1) {
        this.nDanadosVL1 = nDanadosVL1;
    }

    public void setnDanadosRL2(String nDanadosRL2) {
        this.nDanadosRL2 = nDanadosRL2;
    }

    public void setnDanadosAL2(String nDanadosAL2) {
        this.nDanadosAL2 = nDanadosAL2;
    }

    public void setnDanadosVL2(String nDanadosVL2) {
        this.nDanadosVL2 = nDanadosVL2;
    }
            
   public ServidorHilo getHilooriginal() {
        return hilooriginal;
    }

    public void setHilooriginal(ServidorHilo hilooriginal) {
        this.hilooriginal = hilooriginal;
    }

    public DataOutputStream getDatosSalida() {
        return datosSalida;
    }

    public DataInputStream getDatosEntrada() {
        return datosEntrada;
    }
    
}

    

