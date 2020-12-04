package com.company;

public class Primes { public static void main(String[] args) {
    for (int i = 2; i <= 100; i++) {
        if (isPrime(i) == true)
        {
            System.out.println("Число " +i+ " является простым");
        }
    }

}
    public static boolean isPrime(int n)
    {
        int k=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0)k++;
        }
        if (k>2) return false;
        else return true;
    }
}

