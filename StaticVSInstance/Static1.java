/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticVSInstance;

/**
 *
 * @author Joseph
 */
public class Static1 {
    
    //Class level
    //Avoid static variables as much as possible for OOP purposes
    //Declaring something static means that when make an instance and change 
    //---the value, the value is changed in ALL instances
    public static int getMe = 1;
    
    public int getNumber()
    {
        return getMe;
    }
}
