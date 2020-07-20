public class ex4 {
    public static void windowPosSum(int[] a, int n) {
        for(int i = 0; i < a.length - 1; i = i+1){
            if (a[i] < 0) {
                continue;
            }
            for(int m = 1; m < n+1; m = m+1){
                if (i+m > a.length-1){
                    break;
                }
                a[i] = a[i] + a[i + m];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
        int[] a1 = {1, -1, -1, 10, 5, -1};
        int n1 = 2;
        windowPosSum(a1, n1);
        // Should print -1, -1, -1, 14, 4, -1
        System.out.println(java.util.Arrays.toString(a1));
    }
}
