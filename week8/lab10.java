package org.example;

import java.util.Scanner;

public class work10 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Enter a month number (1 to 12): ");
        Scanner in = new Scanner(System.in);
        int monthNumber = in.nextInt();
        System.out.println("The month number is: " + months[monthNumber-1]);
        in.close();
    }
}
