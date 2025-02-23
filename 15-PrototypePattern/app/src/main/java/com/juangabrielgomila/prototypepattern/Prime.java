package com.juangabrielgomila.prototypepattern;

/**
 * Created by JuanGabriel on 13/10/17.
 */

public class Prime extends Sequence {

    public  Prime(){
        result = nthPrime(10000);
    }

    public static long nthPrime(int n){

        int i, count;
        for (i =  2, count = 0; count < n; i++){
            if (isPrime(i)){
                count++;
            }
        }

        return i-1;

    }


    private static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n%i==0){
                return false;
            }
        }

        return true;
    }

}
