/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobe.Lambda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GoTraining
 */
public class FruitList {
     public static void main(String[] args) {  
          
         List<String> fruit=new ArrayList<String>();  
        fruit.add("orange");  
        fruit.add("apple");  
        fruit.add("banana");  
        fruit.add("pear");  
          
        fruit.forEach(  
            (f)->System.out.println(f)  
        );  
    }  
}
