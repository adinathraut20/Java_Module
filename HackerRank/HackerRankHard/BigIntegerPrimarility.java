// Primarility Big Integer

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger;
public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       
     
       /* for( i=2;i<=no.divide(i);BigInteger.add(i,1)){
            if(no.remainder(i) == 0){
                flag = false;
                break;
            }
        }*/
        try (Scanner scanner = new Scanner(System.in);)
        {
            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }

        scanner.close();
    }
}
