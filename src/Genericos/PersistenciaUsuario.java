/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Jerry
 */
public class PersistenciaUsuario 
{
    /*
    Esta es una clase Model de tipo Lógico, solamente contiene acciones, 
    métodos que representan acciones concretas, la sintaxis y estructura de
    dicho método depende la acción.
    */
    ArrayList<Usuario>usuarios;
    
    public PersistenciaUsuario() 
    {
        usuarios=new ArrayList<>();
    }
    /*Primero generamos el metodo que nos guarda un usuario*/
    public void guardar(Usuario u) throws  Exception
   {
       //1.- Generar el archivo a guardar
       File f=new File("jerry.rivers");
       if(f.exists()) usuarios=buscarTodos();
       //2.-Indicar que se va a guardar
       FileOutputStream fos=new FileOutputStream(f);//Usamos FileOutputStream, cuando agregamos algo al archivo
       //3.- Generar el objeto que nos va a ayudar a guardar al arrayList de usuarios
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       //4.- Guardamos el objeto
       usuarios.add(u);//Equivalente al "insert to" de SQL en JAVA
       oos.writeObject(usuarios);
   }
    //Empeiza el metodo de Leer a los Usuarios guardados
    public ArrayList<Usuario> buscarTodos()throws Exception
    {
        File f=new File("jerry.rivers");
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        usuarios=(ArrayList<Usuario>)ois.readObject();
        return usuarios;
    }
}
