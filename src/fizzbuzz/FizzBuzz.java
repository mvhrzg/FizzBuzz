/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import java.util.Arrays;

/**
 *
 * @author MHerzog
 */
public class FizzBuzz {
    
    public static void main(String[] args) {
        String[] fizzBuzz = new String[101];
        for(int i = 1; i < fizzBuzz.length; i++){
            fizzBuzz[i] = Integer.toString(i);
            
            if(i%3==0){
               fizzBuzz[i] = "Fizz";
            }
            if(i%5==0){
                fizzBuzz[i] = "Buzz";
            }
            if(i%3==0 && i%5==0){
                fizzBuzz[i] = "FizzBuzz";
            }
            System.out.println(fizzBuzz[i]);
        }
        
    }
}
