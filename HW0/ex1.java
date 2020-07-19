/* EX1a */

public class ex1 {
    public static void main(String[] args) {
        int col = 0;
        while (col < 5) {
            System.out.println();
            int row = 0;
            col = col + 1;
            while (row < col) {
                System.out.print("*");
                row = row + 1;
            }
        }
    }
}