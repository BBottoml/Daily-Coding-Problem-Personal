package Solution;
import java.util.HashMap;

/*
Good morning! Here's your coding interview problem for today.
This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?
 * Bradley Bottomlee
 */


/*
Remarks: 
This implementation is O(n)
The brute force implementation was
O(n^2) so this is a significantly 
more optimal solution
*/

public class Solution {

    public static void main(String[] args) {
        // problem setup 
        // given an array of integers
        int[] someArray = {1, 3, 5, 1, 7, 1, 9};
        int k = 2; 

        System.out.println(sumFound(k, someArray)); 

    }

    public static boolean sumFound(int desiredSum, int[] someArray) {
        
        // initalize a hashmap
        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int i : someArray)
            hp.put(i, i);
        
        // iterate once more through the array and determine if 
        // any two integers add up to desiredSum using the 
        // hashmap
        for (int i : someArray) {
            int currentSum = desiredSum - i;
            if (hp.containsKey(currentSum))
                return true; 
        }

        return false; 
   
        }

}