/*

 */
package Genericos;

import java.io.Serializable;
/**
 *
 * @author Jerry
 */
public class Usuario implements Serializable
{
    private String nombre;
    private Integer edad;
    private String email;

    @Override
    public String toString() 
    {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", email=" + email + '}';
    }
    public Usuario() 
    {
    }
    public Usuario(String nombre, Integer edad, String email) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }
    /**
     * @return the nombre
     */
    public String getNombre() 
    {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    /**
     * @return the edad
     */
    public Integer getEdad() 
    {
        return edad;
    }
    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) 
    {
        this.edad = edad;
    }
    /**
     * @return the email
     */
    public String getEmail() 
    {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) 
    {
        this.email = email;
    }
}
