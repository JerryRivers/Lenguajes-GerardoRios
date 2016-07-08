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

public class Exception2 
{
    public static void main(String[] args) 
    {
        File file=new File("E:\\Escuela\\Java2\\prueba");
        try 
        {
            int x=2;
            int y=0;
            int div=x/y;
            
            FileInputStream fis=new FileInputStream(file); //FileInputStream
            int ch=0;
            StringBuilder builder=new StringBuilder();
            while((ch=fis.read())!=-1)
            {
                builder.append((char)ch);
            }
            System.out.println("Se leyo bien y se encontró esto: "+builder.toString());
        }
        catch (FileNotFoundException ex) 
        {
            System.out.println("Uso de try catch 'FileNotFoundException ex', revisa el nombre de tu archivo");
        } 
        catch (IOException ex) 
        {
            System.out.println("Uso de try catch 'IOException ex'");
        }
        catch (Exception e)
        {
            System.out.println("Uso de try catch 'Exception e' "+e.getMessage());
        }
        finally //Finally siempre se ejecuta se cumplan o no las excepciones
        {
            
        }
       // System.out.println(file);
    }
}
