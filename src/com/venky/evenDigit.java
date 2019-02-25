package com.venky;

public class evenDigit {
    public static void main(String[] args) {

        System.out.println("sum is = " +evenFind(-1123456));

    }
    public static int evenFind(int number){

        int sum =0;
       if (number<0){
            return -1;
       }
        while(number>0){
            int value = number%10;
            if ((number%2)==0){
                sum+=value;
            }
            number /= 10;

        }
        return sum;
    }
}
