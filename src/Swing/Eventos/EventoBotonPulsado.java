/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Eventos;
import java.awt.event.*;
import javax.swing.JButton;

/**
 *
 * @author jerry
 */
public class EventoBotonPulsado implements ActionListener 
{
        public void actionPerformed(ActionEvent e) 
        {
            System.out.println("¡Gracias!");
            JButton boton = (JButton) e.getSource();
            boton.setText("¡Gracias!");
        }    
}
