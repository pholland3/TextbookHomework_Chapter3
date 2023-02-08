/**
 * @Class: TrianglePerimeter
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 7 February 2023
 *
 * Description - This program accepts three inputs from the user -- one for the length of each side of a triangle -- and will
 * calculate the perimeter of the triangle. If, however, the pair of sides entered is LESS THAN the length of the remaining edge,
 * the program will flag this as an error and display that information accordingly. Otherwise, the program will display the
 * perimeter of the triangle accordingly.
 */

import java.util.Scanner;
public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Triangle Perimeter program!");
        System.out.println("This program will accept three inputs from you -- one for each side of a triangle.");
        System.out.println("The program will then calculate the perimeter of a triangle based on the information");
        System.out.println("you entered. WARNING: If you enter two sides of a triangle, the sum of which is less");
        System.out.println("than the length of the third side, you will receive an ERROR MESSAGE.");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Please enter the first side of the triangle:");
        int side1 = input.nextInt();
        System.out.println("For the first side, you entered: " + side1);
        System.out.println("Next, please enter the second side of the triangle:");
        int side2 = input.nextInt();
        System.out.println("For the second side, you entered: " + side2);
        System.out.println("Finally, please enter the third side of the triangle:");
        int side3 = input.nextInt();
        System.out.println("For the third side, you entered:" + side3);
        System.out.println("Great! I will now calculate the sides of the triangle, unless you didn't follow directions!");
        System.out.println("-------------------------------------------------------------------------------------");
        if ((side1 + side2) > side3) {
            int perimeter = side1 + side2 + side3;
            System.out.println("The lengths of the sides you entered:");
            System.out.println("Side 1: " + side1);
            System.out.println("Side 2: " + side2);
            System.out.println("Side 3: " + side3);
            System.out.println("THE PERIMETER OF THE TRIANGLE IS: " + perimeter);
            System.out.println("Now that's a nice, round number!");
        } else if ((side1 + side2) < side3) {
            System.out.println("The lengths of the sides you entered:");
            System.out.println("Side 1: " + side1);
            System.out.println("Side 2: " + side2);
            System.out.println("Side 3: " + side3);
            System.out.println("ERROR: THE SUM OF THE FIRST TWO SIDES ENTERED IS LESS THAN THE LENGTH OF THE");
            System.out.println("THIRD SIDE! THIS IS AN ERROR. TERMINATING PROGRAM!");
        }
    }
}
