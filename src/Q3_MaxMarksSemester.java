/*
Question 3 (From PDF)

Problem:
Raj wants to know the maximum marks scored by him in each semester.

Conditions:
Marks must be between 0 and 100.
If outside this range → "You have entered invalid mark."

Sample Input:
Enter no of semester: 3
Subjects in semester 1: 3l̥
Subjects in semester 2: 4
Subjects in semester 3: 2

Marks semester 1:
50 60 70

Marks semester 2:
90 98 76 67

Marks semester 3:
89 76

Output:
Maximum mark in 1 semester: 70
Maximum mark in 2 semester: 98
Maximum mark in 3 semester: 89
*/

import java.util.Scanner;

public class Q3_MaxMarksSemester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of semesters: ");
        int semesters = sc.nextInt();

        // Loop for each semester
        for (int i = 1; i <= semesters; i++) {

            System.out.print("Enter number of subjects in semester " + i + ": ");
            int subjects = sc.nextInt();

            int max = -1;

            System.out.println("Enter marks:");

            for (int j = 1; j <= subjects; j++) {

                int marks = sc.nextInt();

                // Validation check
                if (marks < 0 || marks > 100) {
                    System.out.println("You have entered invalid mark.");
                    return;
                }

                // Update maximum
                if (marks > max) {
                    max = marks;
                }
            }

            System.out.println("Maximum mark in semester " + i + ": " + max);
        }

        sc.close();
    }
}

/*
Concept Used:
Array Traversal / Looping

Time Complexity:
O(n)

Where n = total number of subjects entered.
*/