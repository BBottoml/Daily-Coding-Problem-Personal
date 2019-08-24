/*
Good morning! Here's your coding interview problem for today.
This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?
 * Bradley Bottomlee
 */

#include <iostream>
#include <vector>
#include <cassert>

int main() {

    // prototype
    bool sumKEasy(int, std::vector<int>);

    // example test
    std::vector<int> list = {1, 3, 5, 1, 7, 1, 9};
    int k, m;
    k = 8;
    m = 0;

    assert(sumKEasy(k, list) == 1);
    assert(sumKEasy(m, list) == 0);

    std::cout << "When k = 8: " << sumKEasy(k, list) << std::endl;
    std::cout << "When k = 0: " << sumKEasy(m, list) << std::endl;

    return 0;
}

// easy implementation
// we iterate through the entire array in the outer loop
// and from j to n in the inner loop
// hence this is O(n^2) time complexity
bool sumKEasy(int k, std::vector<int> list) {

    unsigned int i, j;
    unsigned int n = list.size();

    for (i = 0; i < n; i++) {
        for (j = i; j < n; j++) {
            if (i != j && list[i] + list[j] == k)
                return true;
        }
    }
    return false;
}

// intend to implement bonus