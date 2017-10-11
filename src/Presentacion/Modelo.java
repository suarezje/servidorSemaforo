package Presentacion;

import ServidorPrincipal.Servidor;
import java.awt.Color;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Modelo implements  Runnable{
     
     private Vista ventanaPrincipal;
     private Thread Hilodibujar;
     private Clientes misSistema;
     private ArrayList<ServidorHilo> listaHilos = new ArrayList<ServidorHilo>();

    public Clientes getMisSistema() {
        return misSistema;
    }

    public void setMisSistema(Clientes misSistema) {
        this.misSistema = misSistema;
    }

    public ArrayList<ServidorHilo> getListaHilos() {
        return listaHilos;
    }

    public void setListaHilos(ArrayList<ServidorHilo> listaHilos) {
        this.listaHilos = listaHilos;
    }
     
     
    public Thread getHilodibujar() {
        return Hilodibujar;
    }

    public void setHilodibujar(Thread Hilodibujar) {
        this.Hilodibujar = Hilodibujar;
    }
    void FinalizarHilo() {
        Hilodibujar.destroy();
}
    public Modelo() {
         Hilodibujar = new Thread(this);
    }   

     public Clientes getMiSistema() {
        if(misSistema == null){
            misSistema = new Clientes();
        }
        return misSistema;
    }
     
    public Vista getVentanaPrincipal() {
       
        if(ventanaPrincipal == null){
            ventanaPrincipal = new Vista(this);
        }
           return ventanaPrincipal;
    }

    public void setVentanaPrincipal(Vista ventanaPrincipal) {
        
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    public void iniciar() throws IOException, InterruptedException {
      getMiSistema().setEstaMoviendose(true); 
      iniciarservidor();
    }
     public void iniciarservidor() throws IOException, InterruptedException{
     ServerSocket ss = null;        
        try {
            System.out.println("Inicia servidor");
            ss = new ServerSocket(10578);                        
            
            //Variables de sesiones  de los clientes conectados           
            
            while (true) {
                Socket socket;
                socket = ss.accept();         
                ServidorHilo cliente = new ServidorHilo(socket);
                TimeUnit.SECONDS.sleep(1);
                int sesionTemp = cliente.getIdSession();
                System.out.print("Sesiontemporal"+ sesionTemp);
                boolean flag = true;
                // recorrer el array buscando este id...
                // si no esta, lo adicionamos al array y luego iniciamos el hilo con start()
                
                for(ServidorHilo sHilo : listaHilos){                      
                  if(sesionTemp == sHilo.getIdSession())
                  {                    
                      System.out.println("Datos del formulario"+sHilo.getFrame()+"cliente id "+ sHilo.getIdSession());
                                            
                      //cliente.start();
                      cliente.setExiste(false);
                      cliente.setHilooriginal(sHilo);
                      cliente.ValidaComando(sHilo.getSemaforoLinea1(), sHilo.getSemaforoLinea1());
                      //cliente.desconnectar();
                      //sHilo.ValidaComando();
                      
                      //sHilo.run();
                      flag = false;                      
                  }
                }      
                //El cliente es nuevo
                if(flag)
                {
                  System.out.println("Se conecta cliente " + sesionTemp);
                  cliente.setIdSession(sesionTemp);
                  //cliente.setFrame(ventanaPrincipal);
                  listaHilos.add(cliente);
                  cliente.start();
                  cliente.setIpCliente(socket.getInetAddress().toString());
                  System.out.println("--------------ip:" + cliente.getIpCliente());
                 // ventanaPrincipal.setVisible(true);
                  ventanaPrincipal = new Vista(this);
                  ventanaPrincipal.iniciar();
                  ventanaPrincipal.setVisible(true);
                  cliente.setFrame(ventanaPrincipal);
                  cliente.getFrame().cambiarid(cliente.getIdSession());
                  if(!Hilodibujar.isAlive()){
                       Hilodibujar.start();
                  }
                }flag = true;           
            }  
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            ss.close();
        }
    }

    @Override
    public void run() {
        while (getMiSistema().isEstaMoviendose()) {            
            dibujar();
        }
    }
    
     public void dibujar(){
        
        try{                                
              
                TimeUnit.SECONDS.sleep(1);
                 //recorrer el array buscando este id...
                 //si no esta, lo adicionamos al array y luego iniciamos el hilo con start()
                
                for(ServidorHilo sHilo : listaHilos){ 
                    // si esta en la lista, tenemos que decirle al cliente que no es valida la conexion
                      //ventanaPrincipal = new Vista(this); 
                      //ventanaPrincipal=cliente.getFrame(); 
                      System.out.println("Datos del formulario"+sHilo.getSemaforoLinea1()+"cliente id "+ sHilo.getSemaforoLinea2());
                      //sHilo.getFrame().cambiarid(cliente.getIdSession());
                    //  sHilo.getFrame().cambiarid(sHilo.getCliente().getLinea1a());
                      sHilo.getFrame().setCantL1(sHilo.getSemaforoLinea1());
                      sHilo.getFrame().setCantL2(sHilo.getSemaforoLinea2());
                      sHilo.getFrame().setResultadoRojoL1(sHilo.getnDanadosRL1());
                     // System.out.println("Valor seteado  "+sHilo.getnDanadosRL1());
                      sHilo.getFrame().setResultadoAmarilloL1(sHilo.getnDanadosAL1());
                      sHilo.getFrame().setResultadoVerdeL1(sHilo.getnDanadosVL1());
                      sHilo.getFrame().setResultadoRojoL2(sHilo.getnDanadosRL2());
                      sHilo.getFrame().setResultadoAmarilloL2(sHilo.getnDanadosAL2());
                      sHilo.getFrame().setResultadoVerdeL2(sHilo.getnDanadosVL2());
                      


//cliente.getFrame().setBackground(Color.yellow);
                      // cliente.desconnectar();
                  
                }                   
      }catch(Exception e){
          System.out.println("excepcion         "+e);

    }      
 }
    public void RetornarHilo(int idsesion){
                 int y=0;    
                 for(ServidorHilo sHilo : listaHilos){                      
                            if(idsesion == sHilo.getIdSession())
                         {                    
                             sHilo.getFrame().setVisible(false);
                             sHilo.desconnectar();                    
                             listaHilos.remove(y);
                             y++;
                             break;
                        }
                 }
     }

     public void enviardatoscliente(boolean L1r, boolean L1a, boolean L1v, boolean L1i, boolean L2r, boolean L2a, boolean L2v, boolean L2i,int sesion) throws InterruptedException, IOException {
        // System.out.print("E|"+boolToInt(L1r)+","+  boolToInt(L1a)+","+  boolToInt(L1v)+","+  boolToInt(L1i)+"-"+  boolToInt(L2r)+","+  boolToInt(L2a)+","+  boolToInt(L2v)+","+  boolToInt(L2i));
          String Envio=("E|"+boolToInt(L1r)+","+  boolToInt(L1a)+","+  boolToInt(L1v)+","+  boolToInt(L1i)+"-"+  boolToInt(L2r)+","+  boolToInt(L2a)+","+  boolToInt(L2v)+","+  boolToInt(L2i));
          System.out.print(Envio);  
     try{
         for(ServidorHilo sHilo : listaHilos){                      
           if(sesion == sHilo.getIdSession())
           {            
               
               sHilo.getDatosSalida().writeUTF(Envio);
               
               System.out.println("sHilo"+sHilo.getDatosEntrada());              /* String ip=sHilo.getIpCliente();
                System.out.print("Datos de la conexion"+ip + Envio); 
                Enviarinstruccione e=new Enviarinstruccione();
                e.CrearCliente(ip, Envio);
                */
               break;
            }      
          }
         }
     catch(Exception e){
         System.err.println("ENTRA CATCH 2 UUU"+e);
     }
     }
    public int boolToInt(boolean b) { return b ? 1 : 0; }
}    

