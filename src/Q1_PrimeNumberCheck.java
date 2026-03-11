/*
Question 1 (From PDF)
Check if a Number is Prime

Problem:
Write a function to check if a given number is prime.

Input:
Number = 29

Output:
True

Explanation:
A prime number is a number that is divisible only by 1 and itself.
29 satisfies this condition.

Source:
DSA Question PDF – Number System Section
*/

public class Q1_PrimeNumberCheck {

    /*
    Function to check if a number is prime
    */
    public static boolean isPrime(int n) {

        // Numbers less than 2 are not prime
        if (n < 2) {
            return false;
        }

        // Check divisibility from 2 to n-1
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int number = 29;

        boolean result = isPrime(number);

        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

/*
-----------------------------------------------------
OPTIMIZED APPROACH (Better for Placements)

Instead of checking up to n,
we check only up to √n.

Reason:
If n = a × b
one factor must be ≤ √n.

Time Complexity:
O(√n)

Code:

for(int i = 2; i * i <= n; i++){
    if(n % i == 0){
        return false;
    }
}
-----------------------------------------------------
*/