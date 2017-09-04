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
public class CopyConstructor {
    
    class Student
    {
        public String name;
        public int marks;
        
        //Constructor
        Student(String name, int marks)
        {
            System.out.println("I am laerning");
            this.name = name;
            this.marks = marks;
        }
        
        //Copy Constructor
        Student(Student Student)
        {
            System.out.println("I am laerning");
            this.name = name;
            this.marks = marks;
        }
        
        
    }
    
    
}
