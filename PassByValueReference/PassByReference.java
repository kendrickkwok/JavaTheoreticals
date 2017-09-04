/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassByValueReference;

/**
 *
 * @author Joseph
 */
public class PassByReference {
    
    int reference = 5;
        
        public void doSomething(PassByReference pr)
        {
            reference = reference + 5;
        }
}
