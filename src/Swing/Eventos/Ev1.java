/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Eventos;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author jerry
 */
public class Ev1 extends JFrame
{
    public Ev1()
    {
        super("Botón");
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton boton = new JButton("¡Púlsame!");
        boton.addActionListener(new EventoBotonPulsado());
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(boton);
    } 
}
