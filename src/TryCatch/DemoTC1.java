/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatch;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author jerry
 */
public class DemoTC1 
{
    public static void main(String[] args) 
    {
        File fl=new File("/var/log/tmp.log");
        
        try 
        {
            FileWriter fr = new FileWriter(fl);
            fr.write("Nueva linea");
            fr.close();
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }
    }
}
