/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClasses;

/**
 *
 * @author Joseph
 */

//**Should not use this class, avoid at all costs**//
public class OuterClass {
    //Avoid innerclasses as much as possible
    private int hello = 5;
    public void OuterClass1()
    {
        int someVariable;
        final int finalVariable = 5;
        
        class onlyUsableWhenCallMethod
        {
            public void printMe()
            {
            System.out.println(hello);
            //System.out.println(someVariable);
            System.out.println(finalVariable);
            }
            //Only when called method
        }
    }
}
