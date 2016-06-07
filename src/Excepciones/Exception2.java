/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author T-107
 */
 //¡**************Excepciones de tipo 'Checked'*********************!
         /*En este tipo de excepciones, nosotros debemos hacernos cargo de ellas
            Vamos a usar un paquete que no viene por default y hay que agregarlo
            con la palabra reservada 'import'.
        */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Exception2 
{
    public static void main(String[] args) 
    {
        File file=new File("E:\\Escuela\\Java2\\prueba.txt");
        try 
        {
            FileInputStream fis=new FileInputStream(file); //FileInputStream
        }
        catch (/*FileNotFound*/Exception ex) 
        {
            
        }
        System.out.println(file);
    }
}
