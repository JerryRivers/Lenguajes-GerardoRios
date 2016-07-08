/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author T-107
 */
public class Arreglos2 
{
    public static void main(String[] args) 
    {
        //1.-Todos los arreglos son tratatdos como objetos
        int array1[] = new int[3];
        array1[0]=7;
        array1[1]=14;
        array1[2]=21;
        
        //int x; La x da error al no estar inicializada
        
       /* for(int i=0; i<array1.length; i++)
        {
            System.out.println(array1[i]);
        }
        Este For es antiguo asi q implementaremos uno mas reciente y efectivo*/ 
       
       //enhanced For
       for(int x:array1)
       {
           System.out.println(x);
       }
    }
}
