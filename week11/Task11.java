import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[][] employee = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 4, 4},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},
            {8, 3, 4, 6, 3, 5, 9}
        };

        int[][] employeeTotalHours = new int[employee.length][2];

        for (int i = 0; i < employee.length; i++) {
            int totalHours = 0;
            for (int j = 0; j < employee[i].length; j++) {
                totalHours += employee[i][j];
            }
            employeeTotalHours[i][0] = i;
            employeeTotalHours[i][1] = totalHours;
        }

        Arrays.sort(employeeTotalHours, (a, b) -> b[1] - a[1]);

        System.out.println("Employee\tTotal Hours");
        for (int[] employeeData : employeeTotalHours) {
            System.out.println("Employee " + employeeData[0] + "\t" + employeeData[1]);
        }
    }
}

