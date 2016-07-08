/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author T-107
 */
public class OperacionesUsuario 
{
    public String calcularEdadEnDias(Usuario u)
    {
        int edadDias=u.getEdad()*365;
        return ""+edadDias;
    }
}
