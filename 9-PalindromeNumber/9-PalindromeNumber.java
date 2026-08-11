// Last updated: 8/11/2026, 2:18:36 PM
import java.util.*;
public class Solution{
      public boolean isPalindrome(int x){
        if(x<0) return false;
        int d,ans=0;
        int temp = x;
        while(x!=0) {
            d = x%10;
            ans = ans*10+d;
            x = x/10;
        }
        if(ans==temp) {
        System.out.println("true");
        }
        else {
        System.out.println("false");
        }
        return ans==temp;
    }
}
