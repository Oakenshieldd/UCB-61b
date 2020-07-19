public class ex3 {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int i = 1;
        for (int N = 1; N < m.length; N = N+1){
            if (m[i] < m[N]) {
                i = N;
                N = N+1;
            }
            else{
                N = N+1;
            }
        }
        return m[i];
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(forMax(numbers));
    }
}
