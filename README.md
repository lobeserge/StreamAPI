# StreamAPI
## Functional Interface and Lambda Expression
In this project we are going to see the various features of the java Functional Interface and Lambda Expression


### what is a functional interface 
It is an interface which has only one abstract method. To specify a functional interface in java we use the annotation given by    ```@FunctionalInterface ```

### what is a Lambda Expression
It is a special java feature which provides implementation of functional interface.

### Why we should use lambda expression

* Lambda Expression provides an easy way for implementing functional interfaces 
*	Less coding since we don't need to define the method again for providing the implementation. With Lambda expressions, we just write the implementation code.
### General Syntax of a lambda expression
The general representation for a lambda expression is 
```
(arguments) -> {body}
```
where
* #### Arguments: 
##### specifies the arguments from the abstract method which could be null or contains parameters.
* #### Arrow-token: 
##### used to link the arguments and body of expression.
* #### Body:
##### contains expressions and statements for lambda expression.


Examples of a no parameter, a single parameter and a two-parameter lambda expression are respectively represented as:
```
() -> {  
//Body implementation of abstract method
} 
(x) -> {  
//Body implementation of abstract method
} 
(x, y) -> {  
// Body implementation of abstract method 
} 

```

### How does lambda Expression come in??
In this section I will present sample code examples of how lambda expression is applied in various areas in java:

### Example 1: Saying hello (with no parameter) 
Consider a simple functional interface use to print a greeting on console  
#### No lambda Expression used 
```
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
           }  
}
```

#### With lambda Expression 
```
public class GreetMe {
    @FunctionalInterface 
     interface Greetings{  
    public String greet();  
} 
    public static void main(String[] args){
      Greetings greetme=()->{
      return "\nhello world from lambda expression\n";
};
System.out.print(greetme.greet());
    }  
}
```
### Example 2: Computing Sum (with two parameters)
Consider a simple functional interface use to compute sum of two numbers.
#### No lambda Expression used 
```
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
}
}
```
#### With lambda Expression 
```
@FunctionalInterface
interface SumCompute{
   public int expr(int x,int y);
}
public class Sum {
        public static void main(String[] args) {   
            //With lambda Expression
        SumCompute s=(x,y)->(x+y);
        System.out.println(s.expr(4, 5))  
}
}
```
Clearly one can see the effect lambda expression has, as it removes all non-essential code thus reducing the lines of code and saving time while also improving code readability.


### Example 3: Using or not using return key words: 
It is worth noting that if there is only one statement, we may choose to or not to use return key word. However, we must use return keyword when lambda expression contains multiple statements.
For instance , in example 2 above a return statement was omitted in the expression 
     ```   SumCompute s=(x,y)->(x+y);```
Which may have been written as
```
        SumCompute s=(x,y)->{
return x+y;    //not necessary 
}
```
### Example 4: Java lambda Expression in creating Threads
Consider the program below in printing a character n times using a thread 
 with and without a lambda expression 
``` public class CharacterThread {
       public static void main(String[] args) {  
      //no lambda expression used
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
       //using lambda expressios
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

```





### Example 5: Handling a foreach loop with lambda expression 
In this program we create a simple list to hold fruits and print the elements of the list using a foreach loop with a lambda expression.
```
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
```

###Example6: Handling a Comparator  with lambda expression:
for this example we refer to the package lobe.lambdacomparator and we see how handling a list of student and sorting with comparator using lambda expression is way easier . in snippet from the code is given below :
  ```
  //sort students by name
   student.sort(Comparator.comparing(e->e.getName()));
   System.out.print(studentsort);
   ```



 



