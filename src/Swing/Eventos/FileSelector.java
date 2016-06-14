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
 * @author T-107
 */
public class FileSelector extends JFrame
{
    public FileSelector()
    {
        super("FileSelector");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lb1 = new JLabel("Cargar Archivo");
        JLabel lb2 = new JLabel("Seleccionar Archivo");
        JButton boton = new JButton("Buscar");
        JButton boton2 = new JButton("Buscar");
        boton.addActionListener(new FileEvent());
        boton2.addActionListener(new FileEvent());
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.setLayout(new GridLayout(2,2));
        cp.setLayout(new GridBagLayout());
        
        cp.add(lb1);
        cp.add(lb2);
        cp.add(boton);
        cp.add(boton2);
    }
}
