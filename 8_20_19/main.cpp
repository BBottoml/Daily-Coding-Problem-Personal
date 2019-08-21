/*
This problem was asked by Uber.
Given an array of integers, return a new array such that
each element at index i of the new array is the product of all
the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected
output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */

#include <iostream>

// global for testing
int ELEMENTS = 5;

int main() {

    // function prototype
    void newArr(const int *, int *);

    // test example
    int newArray[ELEMENTS];
    int arr[] = {1, 2, 3, 4, 5};
    newArr(arr, newArray);

    std::cout << "The new array is: " << std::endl;
    for (int i = 0; i < ELEMENTS; i++)
        std::cout << newArray[i] << std::endl;


    return 0;
}

// We iterate from 0 to n in outer loop
// and from 0 to n in inner loop
// hence the runtime is O(n^2)
void newArr(const int *someArray, int *newArray) {
    int i, j;

    for (i = 0; i < ELEMENTS; i++) {
        int newNum = 1;
        for (j = 0; j < ELEMENTS; j++) {
            if (i != j) {
                newNum *= someArray[j];
            }
        }
        newArray[i] = newNum;
    }
}