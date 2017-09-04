/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceAbstract;

/**
 *
 * @author Joseph
 */
public abstract class AbstractClassExample {
    //Abstract classes are classes
    //--More expensive because you need a look- up to inherit, while interfaces 
    //---is not a class 
    //------Cannot instantiate an abstract class if abstract keyword is there
    //Can only extend one like how you can extend one class
    //---You can extend multiple interfaces
    
    public void nonAbstractMethod()
    {
        System.out.println("Non abstract");
    }
    
    abstract int abstractMethod();
    
}


