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
public class ProbarUsuario 
{
    public static void main (String args [])
	{
		Usuario u1=new Usuario();
		u1.setEdad(19);
                
                //Creamos un objeto de la clase lógica OperacionesUsuario
                OperacionesUsuario op=new OperacionesUsuario();
		System.out.println("Tu edad es "+op.calcularEdadEnDias(u1));
	}
}





