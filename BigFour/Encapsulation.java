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
public class Encapsulation {
    //Hiding data --> Used for users to not manipulate any data 
    private int score = 5;
    
    public int getScore()
    {
        return score;
    }
    
    public void increase5()
    {
        score = score + 5;
    }
}
