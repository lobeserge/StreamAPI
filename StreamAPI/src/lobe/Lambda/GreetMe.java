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
public class GreetMe {
    
    @FunctionalInterface 
     interface Greetings{  
    public String greet();  
} 
    public static void main(String[] args){
        Greetings greetnolambda=new Greetings(){
           public String greet(){
               return "\nhello world from lambda expression\n";
           } 
        };
        
       System.out.print(greetnolambda.greet());
       
       
      Greetings greetme=()->{
      return "\nhello world from lambda expression\n";
};
    System.out.print(greetme.greet());
    }  
}
