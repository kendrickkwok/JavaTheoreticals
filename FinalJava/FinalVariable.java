/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalJava;

/**
 *
 * @author Joseph
 */
public class FinalVariable {
    //Class cannot be extended
    //Final Variables cannot be modified
    //Final Methods cannot be overwritten
    
    public final int FinalInt = 1;
    
    public FinalVariable()
    {
        //V this does not work because it is final 
        //FinalInt = 2;
    }    
    
    final void FinalMethod()
    {
        
    }
}

class TestingFinalMethod extends FinalVariable
{
    /* Cannot overide final method 
    @Override
    final void FinalMethod()
    {
        
    }
    */
}

final class FinalClass {
};

//Class cannot extend final class, class cannot be modified 
//class ExampleFinalClass extends FinalClass
//{
//}