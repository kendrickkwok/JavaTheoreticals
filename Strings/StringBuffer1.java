/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Joseph
 */
public class StringBuffer1 {
    
    //Thread safe. Performance is enhanced
    //If use string, create new string every single time you try to add value
    //If use StringBuffer, you are manipulating the string itself not creating String
    
    public void Combine()
    {
        StringBuffer str = new StringBuffer();    
        str.append("testing");
        str.append("testingmore");
        System.out.println(str);
    }
}
