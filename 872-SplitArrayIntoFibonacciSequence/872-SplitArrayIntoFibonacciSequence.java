// Last updated: 8/11/2026, 2:15:39 PM
class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> result = new ArrayList<>();
        backtrack(result, num, 0);
        return result;
    }

    private boolean backtrack(List<Integer> list, String s, int index) {
        if (index == s.length() && list.size() >= 3) 
            return true;
        long num = 0;
        for (int i = index; i < s.length(); i++) {
            if (i > index && s.charAt(index) == '0') 
                break;
            num = num * 10 + (s.charAt(i) - '0');
            if (num > Integer.MAX_VALUE) 
                break;
            int size = list.size();
            if (size >= 2) {
                long sum = (long) list.get(size - 1) + list.get(size - 2);
                if (num < sum) 
                    continue;
                else if (num > sum) 
                    break;
            }
            list.add((int) num);
            if (backtrack(list, s, i + 1)) 
                return true;
            list.remove(list.size() - 1);
        }
        return false;
    }
}
