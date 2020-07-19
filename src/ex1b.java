/* ex1b */

public class ex1b {
    public static void DrawTriangle(int N) {
        int col = 0;
        while (col < N) {
            System.out.println();
            int row = 0;
            col = col + 1;
            while (row < col) {
                System.out.print("*");
                row = row + 1;
            }
        }
    }

    public static void main(String[] args) {
        DrawTriangle(10);
    }
}
