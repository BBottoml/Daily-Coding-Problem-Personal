/*
This problem was asked by Facebook.
Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
You can assume that the messages are decodable. For example, '001' is not allowed.

My approach:

We realize there is only one
way for the message to occur
as a representation of only
single digits. Hence we need
to look for combinations where
we can represent a pair, say bb,
as a double digit integer. For
each successful occurence of
a pair, we increment count by 1


Thus,
we only scan through the array once
which is O(n) time complexity. Since
we are not creating any additional data
structures, the space complexity is
constant
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Decoder {

    public static void main(String[] args) {

        // PROBLEM SETUP
        // we need an integer array
        // from 1 -> 26
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 27; i++)
            nums.add(i);

        // PROBLEM SETUP continued
        // get encoded message
        Scanner s = new Scanner(System.in);
        String message = s.next();

        System.out.println(decodeWays(message, nums));


    }

    public static int decodeWays(String msg, ArrayList<Integer> nums) {
        int count = 1;
        for (int i = 0; i < msg.length(); i++) {
            char current = msg.charAt(i);

            if (i + 1 < msg.length()) {
                char next = msg.charAt(i + 1);
                int combo = Integer.parseInt(current + "" + next);
                if (nums.indexOf(combo) != -1)
                    count++;
            }
        }
        return count;

    }

}
