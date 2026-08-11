// Last updated: 8/11/2026, 2:15:50 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {
            boolean alive = true;

            while (alive && asteroid < 0 && !st.isEmpty() && st.peek() > 0) {

                if (st.peek() < -asteroid) {
                    st.pop(); // stack asteroid destroyed
                }
                else if (st.peek() == -asteroid) {
                    st.pop(); // both destroyed
                    alive = false;
                }
                else {
                    alive = false; // current asteroid destroyed
                }
            }

            if (alive) {
                st.push(asteroid);
            }
        }

        int[] result = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}