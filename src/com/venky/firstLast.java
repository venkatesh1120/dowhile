package com.venky;

public class firstLast {

    public static void main(String[] args) {

        System.out.println(lastandFirst(485));

    }
    public static int lastandFirst(int number){

        int firstNu = 0;
            int lastNUm = 0;

            lastNUm = number%10;
            while (number>0){

                firstNu= number%10;
                number/=10;

        }
        return firstNu+lastNUm;

    }




}

