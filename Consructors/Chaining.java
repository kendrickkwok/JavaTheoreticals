/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consructors;

/**
 *
 * @author Joseph
 */
public class Chaining {
    
    class SuperClass{
        String name;
        public SuperClass(String name)
        {
            this.name = name;
        }
    }
    
    class SubClass extends SuperClass
    {
        public int value;
        public SubClass(String name, int value)
        {
            super(name);
            this.value=value;
        }
    }
          
}
