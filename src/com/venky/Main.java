package com.venky;

public class Main {

    public static void main(String[] args) {
        System.out.println("the number is "+even(122));
        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if(evenNumbersFound >=5) {
                break;
            }
        }

//        System.out.println("Total even numbers found = " + evenNumbersFound);



    }
    private static int even(int number){
        do
            {

                return number;


        }while((number%2) == 0);
    }
    public static boolean isEvenNumber(int number) {
        if((number % 2)  == 0) {
            return true;
        } else {
            return false;
        }
    }
}
