package com.example.mycalculatorapp;

public class TaylorMath {
    public static double invFac(double input){
        double total = 1.0;
        for (int i = 1; i < input+1; i++) {
            total /= i;
        }
        return total;
    }
    public static double power(double input, int power){
        double total = 1.0;
        for (int i = 0; i < power; i++) {
            total *= input;
        }
        return total;
    }
    public static double sin(double input, int accuracy){
        double sum = 0.0;
        for (int i = 0; i < accuracy; i++) {
            sum += power(-1.0, i) * power(input,2*i+1) * invFac(2*i+1);
        }
        return sum;
    }
    public static double cos(double input, int accuracy){
        double sum = 0.0;
        for (int i = 0; i < accuracy; i++) {
            sum += power(-1.0, i) * power(input,2*i) * invFac(2*i);
        }
        return sum;
    }
    public static double ln(double input, int accuracy){
        if(input < 0.0){
            return 0.0;
        } else if(input >= 2.0){
            return ln(input/2,accuracy) + 0.69314718056;
        }
        double sum = 0.0;
        input--;
        for (int i = 1; i < accuracy; i++) {
            sum += power(-1.0, i+1) * power(input,i)/i;
        }
        return sum;
    }
    public static double exp(double input, int accuracy){
        double sum = 0.0;
        for (int i = 0; i < accuracy; i++) {
            sum += power(input,i)*invFac(i);
        }
        return sum;
    }
}
