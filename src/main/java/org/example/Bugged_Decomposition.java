package org.example;

import java.util.ArrayList;
import java.util.Arrays;


public class Bugged_Decomposition {

    // asserts require the VM option -ea to be activated ([Menu>Run>Edit Configurations] then [More Options>Add VM options])
    public static void main(String[] args) {
        var primes_A = primeFactorDecomposition(7*11);
        assert(primes_A.equals(Arrays.asList(7,11)));
        var primes_B = primeFactorDecomposition(11*11);
        assert(primes_B.equals(Arrays.asList(11,11)));
        var primes_C = primeFactorDecomposition(11*11*13);
        assert(primes_C.equals(Arrays.asList(11,11,13)));

        var primes_D = primeFactorDecomposition(601475143);
        for (Integer i : primes_D) {
            System.out.println(i);
        }
    }

    /* Compute the decomposition in prime numbers.
     */
    public static ArrayList<Integer> primeFactorDecomposition(Integer n)
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        decompositionHelper(n, primes, 2);
        return primes;
    }

    // primes is an in/out parameter
    private static void decompositionHelper(Integer n, ArrayList<Integer> primes, Integer minFactor)
    {
        for (int i = minFactor; i<Math.floor(Math.sqrt(n)); ++i) {
            if (n % i == 0) {
                primes.add(i);
                decompositionHelper(n / i, primes, i + 1);
                return;
            }
        }

        primes.add(n);
    }
}

