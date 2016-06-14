/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author jerry
 */
public class ArchivoNoTxtException extends Exception
{
    public ArchivoNoTxtException()
    {
        super("lo siento, pero solo leo archivos .txt");
    }
}
