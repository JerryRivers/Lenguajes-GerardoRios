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

/* Con esta seccion se puede crear la ventana con todos los elementos a cargar,
** pero es mejor la otra forma donde dividimos la creacion de la ventana y sus
** elementos de carga.

public class Ventana1 
{
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("V-Test2");
        	f.setSize(400, 300);
        	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	f.setVisible(true);

                JLabel etiqueta = new JLabel("Nombre: ");
                JTextField texto = new JTextField(20);
                JButton boton = new JButton("Saludar");

                Container cp = getContentPane();
                cp.setLayout(new FlowLayout());
                cp.add(etiqueta);
                cp.add(texto);
                cp.add(boton);
    	}
}
*/

public class Ventana1 
{
    public static void main(String[] args) 
    {
        MiVentana1 v = new MiVentana1();
        v.setVisible(true);//Es importante establecer el atributo 'setVisible'
                           //para quelos elementos dentro de la ventana se vean,
                           //ya que si cargamos este atributo en los elementos 
                           //de carga, la ventana aparecera vacia.
    }
}


