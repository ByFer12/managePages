
package com.client.sockets;

import com.client.errores.Errores;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;

public class Conexion {
    public static ArrayList<String>errors;
    public static ArrayList<String>sintactico;
    public static ArrayList<String>lexic;
    public static ArrayList<String>mensajes;
    public static void redSocket(String messege,String user) throws ClassNotFoundException{
             try {
            Socket sock = new Socket("localhost", 10000);
            ObjectOutputStream salida = new ObjectOutputStream(sock.getOutputStream());
            System.out.println("Enviando el mensaje... ");
           
            salida.writeObject(messege);
            salida.writeObject(user);
         ObjectInputStream entrada=new ObjectInputStream(sock.getInputStream());
         errors=(ArrayList<String>)entrada.readObject();
         sintactico=(ArrayList<String>)entrada.readObject();
         lexic=(ArrayList<String>)entrada.readObject();
        mensajes=(ArrayList<String>)entrada.readObject();

            sock.close();
        } catch (IOException ex) {
            System.out.println("No se pudo conectar al servidor...");
        }
    }
}
