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
//static nested classes defined as static
//---Non-static nested classes are called inner classes
public class NestedClass {
    
    public int something = 5;
    static int something1 = 3;
    public static class StaticInnerClass{
        public StaticInnerClass()
        {
            something1 = 2;
            System.out.println("You suck!");
        }
    }
    
    public NestedClass()
    {
        something = 2;
        System.out.println("Lmao");
    }
}
