package com.wcs.fizzbuzz;

public class FizzBuzzer {
    
    public String execute(int number) {
        String executeString="";
        String num=String.valueOf(number);
        if(number % 7==0)
            executeString +="Wizz";
        else
            executeString =num;
        return executeString;
    }
    
}
