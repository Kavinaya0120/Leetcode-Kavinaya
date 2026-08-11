// Last updated: 8/11/2026, 2:13:56 PM
class Solution {
    private static final long MOD = 1_000_000_007L;

    public int maxTotalValue(int[] value, int[] decay, int m) {
        int n = value.length;
        long[] val = new long[n];
        long[] dec = new long[n];
        long maxV = 0;
        for (int i = 0; i < n; i++) {
            val[i] = value[i];
            dec[i] = decay[i];
            maxV = Math.max(maxV, val[i]);
        }

        long countAt1 = count(val, dec, n, 1);

        long X;
        if (countAt1 <= m) {
            // Fewer than m positive-valued selections exist overall; take them ALL, no thresholding.
            X = 1;
        } else {
            long lo = 1, hi = maxV;
            while (lo < hi) {
                long mid = lo + (hi - lo + 1) / 2;
                if (count(val, dec, n, mid) >= (long) m) lo = mid; else hi = mid - 1;
            }
            X = lo;
        }

        long[] res = sumAndCountAbove(val, dec, n, X);
        long sumAbove = res[0];
        long countAbove = res[1];
        long cntAtX = count(val, dec, n, X);

        long remaining;
        if (countAt1 <= m) {
            remaining = cntAtX - countAbove; // take everything at exactly X too
        } else {
            remaining = (long) m - countAbove;
            long avail = cntAtX - countAbove;
            if (remaining > avail) remaining = avail;
            if (remaining < 0) remaining = 0;
        }

        long xMod = ((X % MOD) + MOD) % MOD;
        long totalSum = (sumAbove + (remaining % MOD) * xMod) % MOD;
        totalSum = ((totalSum % MOD) + MOD) % MOD;

        return (int) totalSum;
    }

    private long count(long[] val, long[] dec, int n, long X) {
        long total = 0;
        for (int i = 0; i < n; i++) {
            if (val[i] >= X) {
                long c = (val[i] - X) / dec[i] + 1;
                total += c;
                if (total > 4_000_000_000L) return total;
            }
        }
        return total;
    }

    private long[] sumAndCountAbove(long[] val, long[] dec, int n, long X) {
        long inv2 = (MOD + 1) / 2;
        long sumMod = 0;
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (val[i] > X) {
                long c = (val[i] - (X + 1)) / dec[i] + 1;
                if (c < 0) c = 0;
                count += c;

                long cMod = c % MOD;
                long vMod = ((val[i] % MOD) + MOD) % MOD;
                long dMod = ((dec[i] % MOD) + MOD) % MOD;

                long term1 = (cMod * vMod) % MOD;
                long cm1Mod = ((c - 1) % MOD + MOD) % MOD;
                long term2 = (((cMod * cm1Mod) % MOD) * inv2) % MOD;
                term2 = (term2 * dMod) % MOD;

                long v = ((term1 - term2) % MOD + MOD) % MOD;
                sumMod = (sumMod + v) % MOD;
            }
        }
        return new long[]{sumMod, count};
    }
}