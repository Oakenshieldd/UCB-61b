public class ex2 {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int N = 1;
        int S = 0;
        while (N < m.length) {
            if (m[S] < m[N]) {
                S = N;
                N = N+1;
            }
            else{
                N = N+1;
            }
        }
        return m[S];
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 6, 10, 22};
        System.out.println(max(numbers));
    }
}
