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
public class InterfaceExample extends AbstractClassExample {
    
    public int abstractMethod()
    {
        System.out.println("Hello!");
        return 10;
    }
    //Static overflow Def: 
//    Interface is a contract. I WANT IT THIS WAY, so YOU HAVE TO DO IT THIS WAY 
//            for people who are trying to implement the interface 
                    
    class Student implements People
        {
            @Override
            public void run()
            {
                System.out.println("He runs cool");
            }
            
                  public void teach()
        {
            System.out.println("I am learning");
        }
        }
    
    class Teacher implements People 
    {
        @Override
        public void run()
        {
            System.out.println("He runs wierd");
        }        
        
        public void teach()
        {
            System.out.println("I am teaching");
        }
    }
    
    interface People extends Girl
    {
        public void run();
    }
    
    interface Girl{
        public void teach();
    }
}
