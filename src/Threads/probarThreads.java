/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author Jerry
 */
/*
public class probarThreads
{
    public static void main(String[] args)
    {
        //Creacion del Thread
        primerThread t1=new primerThread();
        t1.start();
    }
}
*/
public class probarThreads implements Runnable
{
    public static void main(String[] args)
    {
        //Creacion del 1er Thread
        primerThread t1=new primerThread();
        t1.start();
        //Creamos 2do Thread
        Runnable r=new probarThreads();//Esto es una referencia de una interfaz
        // probarThreads r2=new Runnable(); Este es un error de Casting y de 
        // propiedades de las iterfaces, als cuales no tienen constructores.
        Thread t2=new Thread(r);
        t2.start();
    }
    @Override
    public void run()
    {
        System.out.println("2do Thread :D !!!");
    }
}
