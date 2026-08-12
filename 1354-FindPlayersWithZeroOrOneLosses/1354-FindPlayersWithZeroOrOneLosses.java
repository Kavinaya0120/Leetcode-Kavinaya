// Last updated: 8/12/2026, 11:52:32 AM
import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        Map<Integer, Integer> losses = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            losses.putIfAbsent(winner, 0);
            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (int player : losses.keySet()) {
            int count = losses.get(player);

            if (count == 0) {
                zeroLoss.add(player);
            } else if (count == 1) {
                oneLoss.add(player);
            }
        }

        Collections.sort(zeroLoss);
        Collections.sort(oneLoss);

        List<List<Integer>> result = new ArrayList<>();
        result.add(zeroLoss);
        result.add(oneLoss);

        return result;
    }
}