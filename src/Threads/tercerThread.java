/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author T-107
 */
public class tercerThread 
{
    public static void main(String[] args) 
    {
        //Creacion de clase interna anónima, se crean dentro de 
        Thread t1=new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("Soy el primer thread");
            }
        });
        
        Thread t2=new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("Soy el segundo thread");
            }
        });
        
        t1.start();
        t2.start();
    }
}
