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
public class Exception1
{
    public static void main(String[] args) 
    {
        //¡**************Excepciones de tipo 'Unchecked'*********************!
        //ArithmeticException Solo se da cuando dividimos entre 0
        float x=4;
        int y=0;
        System.out.println(x/y);
        
        //NumberFormatException, no se
        String fakenum="5";
        int realnum=5;
        System.out.println("Esto es antes de la excepcion");
        int suma = Integer.parseInt(fakenum) + realnum;
        System.out.println("todo esta bien, el resultado es : "+suma);
        if (true)
        {
            System.out.println("Siempre aparecera");
        }
        System.out.println("La ejecucion siempre pasa aqui se ejecute o no el if");
    }
}
