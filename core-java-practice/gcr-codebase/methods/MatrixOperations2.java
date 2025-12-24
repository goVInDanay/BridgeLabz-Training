package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class MatrixOperations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double mat1[][] = createRandomMatrix(2, 2);
		double mat2[][] = createRandomMatrix(3, 3);
		double trans1[][] = transposeMatrix(mat1);
		double trans2[][] = transposeMatrix(mat2);
		double det1 = determinantTwo(mat1);
		double det2 = determinantThree(mat2);
		double inv1[][] = inverseTwo(mat1);
		double inv2[][] = inverseThree(mat2);
		System.out.println("Matrix 1");
		display(mat1);
		System.out.println("Matrix 2");
		display(mat2);
		System.out.println("Transpose 1");
		display(trans1);
		System.out.println("Transpose 2");
		display(trans2);
		System.out.println("\tDeterminant 1 " + det1);
		System.out.println("\tDeterminant 2 " + det2);
		System.out.println();
		System.out.println("Inverse 1");
		display(inv1);
		System.out.println("Inverse 2");
		display(inv2);
	}
	public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = (Math.random() * 10); 
            }
        }
        return matrix;
    }
	public static void display(double mat[][]) {
		for(double rows[] : mat) {
			for(double i : rows) {
				System.out.printf("%10.4f\t", i);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static double determinantTwo(double[][] mat) {
        return mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0];
    }
    public static double determinantThree(double[][] mat) {
        return mat[0][0] * (mat[1][1]*mat[2][2] - mat[1][2]*mat[2][1]) - mat[0][1] * (mat[1][0]*mat[2][2] - mat[1][2]*mat[2][0]) + mat[0][2] * (mat[1][0]*mat[2][1] - mat[1][1]*mat[2][0]);
    }
    public static double[][] inverseTwo(double[][] mat) {
        double det = determinantTwo(mat);
        if(det == 0) {
        	return null;
        }
        double[][] inv = new double[2][2];
        inv[0][0] =  mat[1][1] / det;
        inv[0][1] = -mat[0][1] / det;
        inv[1][0] = -mat[1][0] / det;
        inv[1][1] =  mat[0][0] / det;
        return inv;
    }
    public static double[][] inverseThree(double[][] mat) {
        double det = determinantThree(mat);
        if(det == 0) {
        	return null;
        }
        double[][] inv = new double[3][3];
        inv[0][0] = (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1]) / det;
        inv[0][1] = (mat[0][2] * mat[2][1] - mat[0][1] * mat[2][2]) / det;
        inv[0][2] = (mat[0][1] * mat[1][2] - mat[0][2] * mat[1][1]) / det;
        inv[1][0] = (mat[1][2] * mat[2][0] - mat[1][0] * mat[2][2]) / det;
        inv[1][1] = (mat[0][0] * mat[2][2] - mat[0][2] * mat[2][0]) / det;
        inv[1][2] = (mat[0][2] * mat[1][0] - mat[0][0] * mat[1][2]) / det;
        inv[2][0] = (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]) / det;
        inv[2][1] = (mat[0][1] * mat[2][0] - mat[0][0] * mat[2][1]) / det;
        inv[2][2] = (mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0]) / det;
        return inv;
    }
}
