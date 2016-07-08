/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;


/**
 *
 * @author T-107
 */
public class ProbarGuardado 
{
    public static void main(String[] args) 
    {
        Usuario u= new Usuario("Yesica", 23, "Yesi@live.com");
         PersistenciaUsuario p=new PersistenciaUsuario();
        try 
        {
            p.buscarTodos();
            System.out.println("Usuario Guardado: "+u);
        } catch (Exception ex) 
        {
           System.out.println(ex.getMessage());
        }
    }
}
