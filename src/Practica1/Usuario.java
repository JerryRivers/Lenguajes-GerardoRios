/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

/**
 *
 * @author Gerardo_Rios
 */
public class Usuario 
{
    private double peso;
    private double altura;
    
    /**
     * @return the peso
     */
    public double getPeso() 
    {
        return peso;
    }
    public double getAltura()
    {
        return altura;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) 
    {
        if(peso<0)
	{
            peso=0;
            System.out.println("No debes meter edades menores a 0");
	}
        this.peso = peso;
    }
    
    
}
