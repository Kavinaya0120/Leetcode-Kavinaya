// Last updated: 8/12/2026, 10:04:16 PM
1class Solution {
2    public int countPrimes(int n) {
3
4        if (n <= 2)
5            return 0;
6
7        boolean[] prime = new boolean[n];
8
9        for (int i = 2; i < n; i++) {
10            prime[i] = true;
11        }
12
13        for (int i = 2; i * i < n; i++) {
14
15            if (prime[i]) {
16
17                for (int j = i * i; j < n; j += i) {
18                    prime[j] = false;
19                }
20            }
21        }
22
23        int count = 0;
24
25        for (int i = 2; i < n; i++) {
26            if (prime[i])
27                count++;
28        }
29
30        return count;
31    }
32}