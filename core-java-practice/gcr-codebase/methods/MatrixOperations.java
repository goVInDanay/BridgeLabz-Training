package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class MatrixOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows1 = sc.nextInt();
		int cols1 = sc.nextInt();
		int rows2 = sc.nextInt();
		int cols2 = sc.nextInt();
		int mat1[][] = createRandomMatrix(rows1, cols1);
		int mat2[][] = createRandomMatrix(rows2, cols2);
		int add[][] = addMatrices(mat1, mat2);
		int sub[][] = subtractMatrices(mat1, mat2);
		int prod[][] = multiplyMatrices(mat1, mat2);
		display(add);
		display(sub);
		display(prod);
	}
	public static void display(int mat[][]) {
		for(int rows[] : mat) {
			for(int i : rows) {
				System.out.print("\t" + i);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); 
            }
        }
        return matrix;
    }
	public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        if(rows != mat2.length || cols != mat2[0].length) {
        	System.out.println("Wrong dimensions");
        	return new int[][]{};
        }
        int[][] sum = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return sum;
    }
	public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        if(rows != mat2.length || cols != mat2[0].length) {
        	System.out.println("Wrong dimensions");
        	return new int[][]{};
        }
        int[][] diff = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                diff[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return diff;
    }
	public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat2[0].length;
        if(mat2.length != mat1[0].length) {
        	System.out.println("Wrong dimensions");
        	return new int[][]{};
        }
        int temp = mat1[0].length;
        int[][] prod = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
            	for(int k = 0; k < temp; k++) {
            		prod[i][j] = mat1[i][k] - mat2[k][j];
            	}
            }
        }
        return prod;
    }
}
