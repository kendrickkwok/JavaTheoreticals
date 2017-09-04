/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnonymousClass;

import OverloadingVSOverriding.OverloadVsOverride;

/**
 *
 * @author Joseph
 */
public class AnonymousExample {
        public static void main(String args[]){
        
        OverloadVsOverride oo = new OverloadVsOverride(){
            //**Anonymous Class**/
            public void doThis(int number)
            {
                System.out.println("Hello");
            }
        };                
        
        oo.doThis(5);
    }
}
