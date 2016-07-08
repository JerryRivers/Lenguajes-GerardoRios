/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-107
 */
public class Animal 
{
    String nombre;
    String especie;
    String peso;
    boolean carnivoro;
    
 
    public Animal(String value)
    {
        nombre=value;
    }
    
    public Animal(String value, String value2)
    {
        nombre=value;
        especie=value2;
    }
    
    public Animal(String value, String value2, boolean value3)
    {
        nombre=value;
        especie=value2;
        carnivoro=value3;
    }
    
    public Animal(String value, String value2, boolean value3, String value4)
    {
        nombre=value;
        especie=value2;
        carnivoro=value3;
        peso=value4;
    }
       //constructor por defecto
    public Animal()
    {
        nombre="Leon";
    }
}
