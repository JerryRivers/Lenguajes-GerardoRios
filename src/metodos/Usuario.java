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
public class Usuario 
{
    private int edad;
    
    /**
     * @return the edad
     */
    public int getEdad() 
    {
        return edad;
    }

    /**
     * @param edad1 the edad to set
     */
    public void setEdad(int edad1) 
    {
        if(edad1<0)
	{
            edad1=0;
            System.out.println("No debes meter edades menores a 0");
	}
        this.edad = edad1;
    }
    
    
}
