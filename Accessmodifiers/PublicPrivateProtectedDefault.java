/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accessmodifiers;

/**
 *
 * @author Joseph
 */
public class PublicPrivateProtectedDefault {
    //Default can be accessed by the asme class or classes in same package
    int defaultVariable;
    //Public can access anytime
    public int publicVariable;
    //Private can not be seen, can only be seen in same class
    private int privateVariable;
    //Proteccted can be seen in subclasses, same class, same package
    protected int protectedVariable;
}
