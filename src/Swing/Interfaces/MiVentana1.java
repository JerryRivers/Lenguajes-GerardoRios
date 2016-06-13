package Swing.Interfaces;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jerry
 */

public class MiVentana1 extends JFrame 
{
    public MiVentana1() 
    {
        super("V-Test");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        
        Container cp = getContentPane(); //Creamos un panel contenedor
        cp.setLayout(new FlowLayout()); //Establece un tamaño predefinido que se
                                        //adapte a la pantalla
        cp.add(etiqueta); //Agrega el JLabel
        cp.add(texto); //Agrega el JTextField
        cp.add(boton);//Agrega el JButton
    }
}

