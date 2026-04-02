/*
 * Problem Statement: Develop Matrix class with constructors, transpose and 
 * [span_1](start_span)multiplication[span_1](end_span).
 */

// The Matrix class to handle our operations
class Matrix {
    int[][] data;
    int rows;
    int cols;

    // 1. Constructor to set up the matrix dimensions
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    // Helper method to fill the matrix with data
    public void fillMatrix(int[][] values) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = values[i][j];
            }
        }
    }

    // Helper method to print the matrix nicely
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + "\t"); // \t adds a tab space
            }
            System.out.println(); // Move to the next line for the next row
        }
    }

    // 2. Method to calculate the Transpose
    public Matrix transpose() {
        // Transpose flips rows and columns
        Matrix trans = new Matrix(cols, rows); 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans.data[j][i] = this.data[i][j];
            }
        }
        return trans;
    }

    // 3. Method to Multiply two matrices
    public Matrix multiply(Matrix other) {
        // Rule for multiplication: columns of first must equal rows of second
        if (this.cols != other.rows) {
            System.out.println("Matrix multiplication not possible with these dimensions.");
            return null;
        }
        
        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }
}

// Main class to run the program
public class Program2 {
    public static void main(String[] args) {
        // Create the First Matrix (2 rows, 3 columns)
        Matrix m1 = new Matrix(2, 3);
        int[][] values1 = { {1, 2, 3}, {4, 5, 6} };
        m1.fillMatrix(values1);

        // Create the Second Matrix (3 rows, 2 columns)
        Matrix m2 = new Matrix(3, 2);
        int[][] values2 = { {7, 8}, {9, 10}, {11, 12} };
        m2.fillMatrix(values2);

        System.out.println("--- Matrix 1 ---");
        m1.printMatrix();

        System.out.println("\n--- Transpose of Matrix 1 ---");
        Matrix transposed = m1.transpose();
        transposed.printMatrix();

        System.out.println("\n--- Matrix 2 ---");
        m2.printMatrix();

        System.out.println("\n--- Multiplication (Matrix 1 * Matrix 2) ---");
        Matrix result = m1.multiply(m2);
        if (result != null) {
            result.printMatrix();
        }
    }
}