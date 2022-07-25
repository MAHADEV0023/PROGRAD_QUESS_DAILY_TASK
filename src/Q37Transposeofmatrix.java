import java.util.Scanner;

public class Q37Transposeofmatrix {
    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row size");
        row = sc.nextInt();
        System.out.println("enter the column size");
        col = sc.nextInt();

        int[][] arr = new int[row][col];
        int[][] transpose = new int[col][row];
        System.out.println("enter the elements to matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix elements are");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        display(transpose);

    }
}
