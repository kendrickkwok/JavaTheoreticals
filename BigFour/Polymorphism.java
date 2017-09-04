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
public class Polymorphism {
    
    abstract class People
    {
        abstract String Work();
    }
    
    class Teacher extends People
    {
        public String Work()
        {
            return "I am grading";
        }
    }
    
    class Student extends People
    {
        public String Work()
        {
            return "I am doing homework";
        }
    }
    
    public void printTest()
    {
        People[] people = {new Student(), new Student(), new Teacher()};
        
        for (int i = 0; i < people.length; i++)
        {
            System.out.println(people[i].Work());
        }
        
        int[] hello = {1,2,3};
        for (int i = 0; i < 3; i++)
        {
            System.out.println(hello[i]);
        }
    }
}
