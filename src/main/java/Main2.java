public class Main2 {

    public static void main(String[] args) {

        int row = 4, col = 8;
        int[][] array = new int[row][col];
        int minRow = 0, maxRow = row - 1, minCol = 0, maxCol = col - 1;
        int count = 0;
        int max = row * col;

        while (count < max) {
            for (int i = minRow; i <= maxRow; i++) {
                array[i][minCol] = count;
                count++;
            }
            minCol = minCol + 1;
            for (int i = minCol; i <= maxCol; i++) {
                array[maxRow][i] = count;
                count++;
            }
            maxRow = maxRow - 1;
            for (int i = maxRow; i >= minRow; i--) {
                array[i][maxCol] = count;
                count++;
            }
            maxCol = maxCol - 1;

            for (int i = maxCol; i >= minCol; i--) {
                array[minRow][i] = count;
                count++;
            }
            minRow = minRow + 1;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println("");
        }
    }
}
