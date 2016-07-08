/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class ProbarUsuarios 
{
    public static void main(String[] args) 
    {
       /* //1.- Crear Usuario
        Usuario u= new Usuario("Jerry", 22, "jerry_rivers@live.com");
        //2.- Guardar usuario
        PersistenciaUsuario p=new PersistenciaUsuario();
        try 
        {
            p.guardar(u);
            System.out.println("Usuario Guardado");
        } catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }*/
        
        //Vamos a Leer el ArrayList para ver su contenido
        //1.- Creamos un objeto de la clase PersistenciaUsuario
        PersistenciaUsuario p=new PersistenciaUsuario();
        try 
        {
            ArrayList<Usuario> usuarios=p.buscarTodos();
            int tam=usuarios.size();
            Usuario info=usuarios.get(8);
            System.out.println("Usuarios guardados: "+tam);
            System.out.println("El usuario guardado es: "+info.getNombre()+","+info.getEdad()+","+info.getEmail());
        } catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
}
