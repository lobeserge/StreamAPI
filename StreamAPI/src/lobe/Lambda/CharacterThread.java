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
public class CharacterThread {
       public static void main(String[] args) {  
      
        Runnable r1=new Runnable(){  
            public void run(){  
               PrintChar('a', 100);
                for (int i = 0; i < times; i++) {
                System.out.print(charToPrint);
 } 
                 System.out.print("\n");
            }  
            
        };  
         
        Thread t1=new Thread(r1);  
        t1.start();  
       
        Runnable r2=()->{  
           PrintChar('a', 100);
                for (int i = 0; i < times; i++) {
                System.out.print(charToPrint);
 } 
        };  
        Thread t2=new Thread(r2);  
        t2.start();  
    }
       
       
       private static char charToPrint; // The character to print
       private static int times; // The number of times to repeat


static void PrintChar(char c, int t) {
 charToPrint = c;
 times = t;
 }
}

