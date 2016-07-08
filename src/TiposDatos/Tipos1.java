/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposDatos;

/**
 *
 * @author T-107
 */
public class Tipos1 
{
    public static void main(String[] args) 
    {
       /* 
        //Declaramos un byte
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        b=(byte)s;//short mas grande que byte, por lo tanto no cabe en short, pero al hacerle un "casting forzado" el error se soluciona.
        s=b;//byte menos grande que short por lo tanto si cabe en short
        l=i;//int menos grande que long por lo tanto si cabe en long
        i=s;//short menos grande que int por lo tanto si cabe en int
        l=b;//byte menos grande que long por lo tanto si cabe en long
        s=(short)l;//long mas grande que short, por lo tanto no cabe en short, pero al hacerle un "casting forzado" el error se soluciona.
        i=b;//byte menos grande que int por lo tanto si cabe en int
       */
        Operaciones op=new Operaciones();
        System.out.println(op.Suma((int)4.0, 5.0f));//ya que el tipo de dato por defecto para los flotantes es double se hace un casting agregando 
                                                //una 'f'o 'F' para definirlo como flotante, otra manera de casting puede ser agregando entre 
                                                //parentesis al tipo de dato a convertir. Como se ve en el ejemplo, se convierte a un double(4.0)
                                                //en un entero mediante la sentencia '(int)4.0'
    }
}
