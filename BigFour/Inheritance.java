/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigFour;

/**
 *
 * @author Joseph
 */
public class Inheritance {
    String name = "Kendrick";
    
    public Inheritance(String name)
    {
        this.name = name;
        System.out.println("Consructor called");
        
    }
    
    public Inheritance()
    {
        System.out.println("Inheritance is called");   
    }
    
    public void callMethod()
    {
        System.out.println("Called method");
    }
}
