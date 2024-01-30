/*
 * Name: Jen Tso Huang(Kerry)
 * Date: 2024/1/28
 * Description: This program is to measure the time taken for double matrix multiplication.
 */

import java.util.Random;

public class MatrixMultiplicationDoubleVersion {
    public static void main(String[] args) {
        // Size of matrices - adjust as needed
        int rowsA = 1000, colsA = 900, colsB = 1500;

        // Generating two matrices
        double[][] matrixA = generateRandomMatrixDouble(rowsA, colsA, true);
        double[][] matrixB = generateRandomMatrixDouble(colsA, colsB, true);

        // Measure start time
        long startTime = System.currentTimeMillis();

        // Perform multiplication
        double[][] result = multiplyMatrices(matrixA, matrixB);

        // Measure end time
        long endTime = System.currentTimeMillis();

        // Display time taken
        System.out.println("Time taken for double matrix multiplication: " + (endTime - startTime) + " milliseconds.");
    }

        // ... (other parts of the program remain the same)

    private static double[][] generateRandomMatrixDouble(int rows, int cols, boolean isInteger) {
        double[][] matrix = new double[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextDouble() * 100;
            }
        }
        return matrix;
    }

    private static double[][] multiplyMatrices(double[][] matrixA, double[][] matrixB) {
        double[][] result = new double[matrixA.length][matrixB[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    result[row][col] += matrixA[row][k] * matrixB[k][col];
                }
            }
        }
        return result;
    }
}    

