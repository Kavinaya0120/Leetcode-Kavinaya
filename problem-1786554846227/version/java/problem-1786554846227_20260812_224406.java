// Last updated: 8/12/2026, 10:44:06 PM
1import java.util.*;
2
3class RandomizedSet {
4
5    ArrayList<Integer> list;
6    HashMap<Integer, Integer> map;
7    Random random;
8
9    public RandomizedSet() {
10        list = new ArrayList<>();
11        map = new HashMap<>();
12        random = new Random();
13    }
14
15    public boolean insert(int val) {
16        if (map.containsKey(val))
17            return false;
18
19        map.put(val, list.size());
20        list.add(val);
21
22        return true;
23    }
24
25    public boolean remove(int val) {
26        if (!map.containsKey(val))
27            return false;
28
29        int index = map.get(val);
30        int last = list.get(list.size() - 1);
31
32        list.set(index, last);
33        map.put(last, index);
34
35        list.remove(list.size() - 1);
36        map.remove(val);
37
38        return true;
39    }
40
41    public int getRandom() {
42        return list.get(random.nextInt(list.size()));
43    }
44}