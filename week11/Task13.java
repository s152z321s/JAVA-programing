import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        System.out.println("The randomly generated matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int maxRowIndex = 0;
        int maxRowCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRowIndex = i;
            }
        }

        int maxColIndex = 0;
        int maxColCount = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            int colCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    colCount++;
                }
            }
            if (colCount > maxColCount) {
                maxColCount = colCount;
                maxColIndex = j;
            }
        }

        System.out.println("The first row with the most 1s is row " + maxRowIndex);
        System.out.println("The first column with the most 1s is column " + maxColIndex);
    }
}
