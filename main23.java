import java.util.*;

public class main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int A[][] = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                A[i][j] = sc.nextInt();
            }
        }
        int B[][] = new int[row][col];
         for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                B[i][j] = sc.nextInt();
            }
        }
        int mat[][] = new int[row][col];

        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                mat[i][j] = A[i][j] + B[i][j];
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
