/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
/**
 *
 * @author T-107
 */
public class Validar 
{
    public static void validarExtencion(String extencion)throws NoTxtException
    {
        if(!extencion.equals("txt"))throw new NoTxtException();
    }
}
