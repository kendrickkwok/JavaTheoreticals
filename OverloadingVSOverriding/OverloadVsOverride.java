/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadingVSOverriding;

/**
 *
 * @author Joseph
 */
public class OverloadVsOverride {
    public void doThis(int number)
    {
        System.out.println("This is printed out");
    }
}

class OverrideMe extends OverloadVsOverride
{
    //Same signature to override the method's functionality
    public void doThis(int number)
    {
        System.out.println("Thats a shock!");
    }
}

class OverLoadingMe extends OverloadVsOverride
{
    //Same signature but you overlooad with something else.
    //----Int in one of the methods whic is the same, but if something else in parameters
    //-------then it is overloading
        public void doThis(String something)
    {
        System.out.println("Thats a shock!");
    }
}