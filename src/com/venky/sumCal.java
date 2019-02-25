package com.venky;

public class sumCal {
    public static void main(String[] args) {
        ;

        System.out.println(sumDigits(-88));


    }

    private static int sumDigits(int number){
        int results = 0;
        if (number <= 9) {
            return -1;
        }
        while(number > 0){

            int value = number%10;

            results +=value;

            number/=10;
        }

        return results;





}
}
