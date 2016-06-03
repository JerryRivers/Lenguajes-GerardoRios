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
public class Arreglos1 
{
    public static void main(String[] args) 
    {
        //Diferentes formas de declarar e inicializar un array
        String []mensajes1={"Hola","Esto","Es","Un","Array"};//1
        
        String mensajes2[]={"Hola","Esto","Es","Un","Array"};//2
        
        String mensajes3[]=new String[5];//3
            mensajes3[0]="Hola";
            mensajes3[1]="Esto";
            mensajes3[2]="Es";
            mensajes3[3]="Un";
            mensajes3[4]="Array";
            
        String mensajes4[]=new String[]{"Hola","Esto","Es","Un","Array"};//4
    }
}
