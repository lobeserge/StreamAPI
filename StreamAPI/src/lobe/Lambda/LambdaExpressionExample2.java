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
@FunctionalInterface 
interface Sayable{  
    public String say();  
} 


@FunctionalInterface  //It is optional  
interface Operations{  
    public void compute(int x,int y);  
}  
 
public class LambdaExpressionExample2 {
    
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Operations op=(x,y)->{  
            System.out.println("sum "+(x+y)+" difference "+(x-y) +" product "+(x*y));  
        };  
         Sayable sy=()->{
      return "\nhello from lambda expression\n";
};
         
       
         
         System.out.print(sy.say());
        op.compute(4,9);  
        List<String> mlist=new ArrayList<>();
        mlist.add("hello");
        mlist.add("world");
        mlist.add("from");
        mlist.add("java");
        mlist.forEach(
        n->System.out.println(n)
        );
        
   
        Runnable r1=()->{
            System.out.print("hello from java");
        };
        
        Thread th=new Thread(r1);
        th.start();
        
        
       
    }  
    
 
}
