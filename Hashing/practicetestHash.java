/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Joseph
 */
public class practicetestHash {
        public static void main(String[] args) {
     Map<String, Integer> scores = new HashMap<String, Integer>();
     scores.put("King", 250);
     scores.put("Queen", 260);
     scores.put("Kings", 211);
     System.out.println(scores.get("King"));
     System.out.println(scores.containsKey("Kings"));
     printMap(scores);
    }
        
        public static void printMap(Map mp) {
    Iterator it = mp.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getKey() + " = " + pair.getValue());
        it.remove(); // avoids a ConcurrentModificationException
    }
}
}
