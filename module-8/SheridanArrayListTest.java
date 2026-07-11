/*
	* Author: Sheridan Dela Cruz
	* Date: July 11, 2026
	* Module 8.2
	* Desciption: A program that reads integers into an ArrayList and returns the largest value entered.
 */
 
import java.util.ArrayList;
import java.util.Scanner;

public class SheridanArrayListTest {

    // Required method
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;  // requirement: return 0 if empty
        }

        Integer largest = list.get(0);
        for (Integer value : list) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    // Testing the method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop):");

        while (true) {
            int num = input.nextInt();
            numbers.add(num);   // requirement: even 0 must be added

            if (num == 0) {
                break;
            }
        }

        Integer largestValue = max(numbers);
        System.out.println("The largest value is: " + largestValue);
    }
}
