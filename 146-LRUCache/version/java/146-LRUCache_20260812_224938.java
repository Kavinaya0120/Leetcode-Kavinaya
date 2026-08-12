// Last updated: 8/12/2026, 10:49:38 PM
1import java.util.*;
2
3class LRUCache {
4
5    private final int capacity;
6    private final LinkedHashMap<Integer, Integer> map;
7
8    public LRUCache(int capacity) {
9        this.capacity = capacity;
10
11        map = new LinkedHashMap<>(
12            capacity,
13            0.75f,
14            true
15        );
16    }
17
18    public int get(int key) {
19        return map.getOrDefault(key, -1);
20    }
21
22    public void put(int key, int value) {
23
24        map.put(key, value);
25
26        if (map.size() > capacity) {
27            int firstKey = map.keySet().iterator().next();
28            map.remove(firstKey);
29        }
30    }
31}