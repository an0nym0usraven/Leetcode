import static java.util.Arrays.stream;

public class Solution {
    public int maxDotProduct(int[] A, int[] B) {
        if (A.length < B.length)
            return maxDotProduct(B, A);

        int n = B.length;
        int[] dp = new int[n + 1];

        for (int a : A)
            for (int j = 1, dpAtJMinus1 = 0, tmp; j <= n; j++) {
                tmp = dp[j];

                dp[j] = max(
                        dpAtJMinus1 + Math.max(0, a * B[j - 1]),
                        dp[j],
                        dp[j - 1]
                );

                dpAtJMinus1 = tmp;
            }

        return dp[n] > 0 ? dp[n] : Math.max(minArray(A) * maxArray(B), minArray(B) * maxArray(A));
    }

    private static int max(int... A) {
        return maxArray(A);
    }

    private static int minArray(int[] A) {
        return stream(A).min().orElseThrow();
    }

    private static int maxArray(int[] A) {
        return stream(A).max().orElseThrow();
    }
}