package org.example;

public class work12 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = in.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextDouble();
            sum += numbers[i];
        }
        double average = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == average) {
                count++;
            }
        }
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }
}
