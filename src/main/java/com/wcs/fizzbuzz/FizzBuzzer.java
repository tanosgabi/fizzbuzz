package com.wcs.fizzbuzz;

public class FizzBuzzer {
    
    public String execute(int number) {
        String executeString="";
        String num=String.valueOf(number);
        if(number % 7==0)
            executeString +="Wizz";
        if(num.matches("(.*)3(.*)"))
            executeString +="Fizz";
        if(num.matches("(.*)5(.*)"))
            executeString +="Buzz";
        if(num.matches("(.*)7(.*)"))
            executeString +="Wizz";
        if(executeString.equals("")) 
            executeString =num;
        return executeString;
    }
    
}
