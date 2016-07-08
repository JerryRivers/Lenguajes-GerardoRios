/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Interfaces;

/**
 *
 * @author jerry
 */
public class Ventana3 
{
    public static void main(String[] args) 
    {
        MiVentana3 v = new MiVentana3();
        v.setVisible(true);//Es importante establecer el atributo 'setVisible'
                           //para quelos elementos dentro de la ventana se vean,
                           //ya que si cargamos este atributo en los elementos 
                           //de carga, la ventana aparecera vacia.
    }
}