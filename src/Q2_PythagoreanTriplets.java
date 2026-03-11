/*
Question 2 (From PDF)
Pythagorean Triplets

Problem:
Generate all Pythagorean triplets with values smaller than a given limit.

Input:
limit = 20

Output:
3 4 5
8 6 10
5 12 13
15 8 17
12 16 20

Explanation:
Triplets satisfy:
a² + b² = c²
*/

public class Q2_PythagoreanTriplets {

    public static void generateTriplets(int limit) {

        // Loop through possible values of a
        for (int a = 1; a <= limit; a++) {

            // Loop through possible values of b
            for (int b = a; b <= limit; b++) {

                // Loop through possible values of c
                for (int c = b; c <= limit; c++) {

                    // Check Pythagorean condition
                    if (a * a + b * b == c * c) {

                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int limit = 20;

        generateTriplets(limit);
    }
}

/*
-----------------------------------------------------
Optimized Concept (Euclid Formula)

a = m² - n²
b = 2mn
c = m² + n²

Where:
m > n

Used in advanced mathematics to generate triplets faster.
-----------------------------------------------------
*/