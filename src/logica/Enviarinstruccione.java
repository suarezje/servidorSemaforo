/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.*;
import java.net.Socket;

   
public class Enviarinstruccione {
    protected Socket cliente;
    protected DataOutputStream datossalida;
    protected DataInputStream datosentrada;
    private int id = 1;   
    
    

     public Enviarinstruccione()
     {
         //CrearCliente();
         //BuenosCliente();
     }
    public void CrearCliente(String ip,String datos) throws InterruptedException, IOException
    {
        
        
        //cliente =null;
        try {
            Thread.sleep(15000);
            
            ip=ip.replace("/", "");
System.out.println("Entro a CrearCliente:.."+ip);
            cliente = new Socket(ip, 10579);
            datossalida = new DataOutputStream(cliente.getOutputStream());
            datosentrada = new DataInputStream(cliente.getInputStream());
            System.out.println(id + " envía saludo");
            
            //datossalida.writeUTF("E|0,0,0,1-0,0,0,1");
            
            datossalida.writeUTF(datos);
            while(true)
            {
             String respuesta="";            
            respuesta = datosentrada.readUTF();
            System.out.println(id + " Servidor respondio: " + respuesta); 
            }
            } catch (IOException ex) {
                System.out.println("catch io" + ex);
                
            
        }
//        finally
//        {
//          cliente.close();
//        }
   
    }

}

