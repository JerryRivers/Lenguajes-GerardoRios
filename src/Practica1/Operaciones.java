/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

/**
 *
 * @author jerry
 */
public class Operaciones 
{
    public String CalcularImc(Usuario p, Usuario a)
    {
        double imc = p.getPeso()/(a.getAltura()*a.getAltura());
        return ""+imc;
    }
}
