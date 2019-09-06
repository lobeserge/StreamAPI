/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobe.lambdafilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author GoTraining
 */
public class LambdaFilterProduct {
   
    public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
          
        //Add products to product list 
        list.add(new Product(1,"Samsung S6",45000f));  
        list.add(new Product(3,"MacBook Pro",200000f));  
        list.add(new Product(2,"HP Laptop",3000f));  
          
        System.out.println("sort product list by name");  
  
        // implement a lambda expression to print out sorted list  
        Collections.sort(list,(prod1,prod2)->{  
        return prod1.name.compareTo(prod2.name);  
        });  
        for(Product p:list){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }  
  
    }  
    
    
    
    
}
