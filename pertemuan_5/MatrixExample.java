package pertemuan_5;

public class MatrixExample {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {2, 4, 6},
        };

        System.out.println("Row count: " + matrix.length);
        System.out.println("Column count: " + matrix[0].length);
        outputArray(matrix);
    }

    public static void outputArray(int[][] array) {
        int rowCount = array.length;
        int colCount = array[0].length;

        for (int i = 0; i <= 1; i++ ) {
            System.out.print("[");
            for (int j = 0; j <= 2; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("]");
        }
    }
}
