package com.venky;

public class numberTowords {

    public static void main(String[] args) {
numberToWords(1000);
       

    }
    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid value.");

        int reversedNumber = reverse(number);
        int reverse2 = reversedNumber;

        while(reversedNumber > 0) {
            int temp = reversedNumber % 10;

            switch (temp) {
                case 0:
                    System.out.println("Zero"); break;
                case 1:
                    System.out.println("One"); break;
                case 2:
                    System.out.println("Two"); break;
                case 3:
                    System.out.println("Three"); break;
                case 4:
                    System.out.println("Four"); break;
                case 5:
                    System.out.println("Five"); break;
                case 6:
                    System.out.println("Six"); break;
                case 7:
                    System.out.println("Seven"); break;
                case 8:
                    System.out.println("Eight"); break;
                case 9:
                    System.out.println("Nine"); break;
            }

            reversedNumber /= 10;
        }

        while(getDigitCount(number) != getDigitCount(reverse2)) {
            System.out.println("Zero");
            reverse2 *=10;
        }
    }

    public static int reverse(int num) {
        int reverse = 0;
        if (num == 0) return reverse;

        while (num != 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int num) {
        if (num < 0) return -1;

        return String.valueOf(num).length();
    }
}






