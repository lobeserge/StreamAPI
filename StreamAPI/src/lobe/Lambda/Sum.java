/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobe.Lambda;

/**
 *
 * @author GoTraining
 */

@FunctionalInterface
interface SumCompute{
   public int expr(int x,int y);
}

public class Sum {
        public static void main(String[] args) {  

            //Without Lambda Expressions
            SumCompute e=new SumCompute(){
               public int expr(int x,int y){
                   return x+y;
               }
            };
            System.out.println(e.expr(4, 5));
                    
            
            
            //With lambda Expression
        SumCompute s=(x,y)->(x+y);
        
        System.out.println(s.expr(4, 5));
}
}